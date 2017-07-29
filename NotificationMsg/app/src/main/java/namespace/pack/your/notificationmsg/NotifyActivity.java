package namespace.pack.your.notificationmsg;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.InputStream;

public class NotifyActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                PendingIntent pIntn = PendingIntent.getActivity(NotifyActivity.this, 0, intent, 0);
                Notification nt = new Notification.Builder(NotifyActivity.this).setTicker("TickerTitle").setContentTitle("ContentTitle")
                        .setContentText("ContextText").setSmallIcon(R.drawable.ic_launcher)
                        .setContentIntent(pIntn).getNotification();
                nt.flags = Notification.FLAG_AUTO_CANCEL;
                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                nm.notify(0, nt);
            }

            }
        );
        }



}
