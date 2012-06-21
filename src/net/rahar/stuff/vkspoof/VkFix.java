package net.rahar.stuff.vkspoof;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class VkFix extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        if (getIntent().getData() != null)  {
            String uri = getIntent().getData().toString();
            if (uri.contains("vkontakte.ru")) {
                uri = uri.replace("vkontakte.ru", "vk.com");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse(uri), "video/*");
                startActivity(intent);
                finish();
            }
        }
    }
}
