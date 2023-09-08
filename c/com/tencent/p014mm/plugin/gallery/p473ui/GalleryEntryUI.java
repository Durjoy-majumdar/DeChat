package com.tencent.p014mm.plugin.gallery.p473ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import nj3.C88989a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.gallery.ui.GalleryEntryUI */
public final class GalleryEntryUI extends HellActivity {

    /* renamed from: d */
    public boolean f271350d = false;

    /* renamed from: e */
    public int f271351e;

    /* renamed from: f */
    public int f271352f;

    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = intent == null ? "" : intent.toString();
        Log.m105925i("MicroMsg.GalleryEntryUI", "on activity result, requestCode %d resultCode %d, data:%s", objArr);
        if (i2 != -1) {
            if (i2 == 0) {
                Log.m105918d("MicroMsg.GalleryEntryUI", "user choose canceld");
                setResult(0);
            } else if (i2 == 1) {
                setResult(1);
            }
        } else if (intent != null) {
            setResult(-1, intent);
        } else {
            return;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.GalleryEntryUI", "on create");
        super.onCreate(bundle);
        Log.m105925i("MicroMsg.GalleryEntryUI", "checktask onCreate:%s#0x%x task:%s", "GalleryEntryUI", Integer.valueOf(hashCode()), Util.getActivityTaskInfo(this));
        this.f271351e = getIntent().getIntExtra("query_source_type", 3);
        this.f271352f = getIntent().getIntExtra("query_media_type", 1);
        Log.m105924i("MicroMsg.GalleryEntryUI", "query souce: " + this.f271351e + ", queryType: " + this.f271352f);
        C93958f.m118750j().mo128903I(this.f271352f);
        C93958f.m118750j().f271196f = this.f271351e;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.m105919d("MicroMsg.GalleryEntryUI", "on new intent, #0x%x", Integer.valueOf(hashCode()));
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Log.m105918d("MicroMsg.GalleryEntryUI", "onRestoreInstanceState");
        super.onRestoreInstanceState(bundle);
        this.f271350d = true;
    }

    public void onResume() {
        Log.m105925i("MicroMsg.GalleryEntryUI", "on resume, init %B", Boolean.valueOf(this.f271350d));
        super.onResume();
        if (!this.f271350d) {
            Log.m105925i("MicroMsg.GalleryEntryUI", "doRedirect %s", Util.getStack());
            Intent intent = getIntent();
            if (intent.getBooleanExtra("preview_image", false)) {
                Log.m105918d("MicroMsg.GalleryEntryUI", "jump to preview ui directly");
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("preview_image_list");
                Intent intent2 = new Intent(this, ImagePreviewUI.class);
                intent2.addFlags(67108864);
                intent2.putExtra("max_select_count", intent.getIntExtra("max_select_count", 9));
                intent2.putExtra("query_source_type", this.f271351e);
                intent2.putExtra("isPreviewPhoto", intent.getBooleanExtra("isPreviewPhoto", false));
                intent2.putExtra("preview_image", intent.getBooleanExtra("preview_image", false));
                intent2.putExtra("key_force_hide_edit_image_button", getIntent().getBooleanExtra("key_force_hide_edit_image_button", false));
                intent2.putExtra("key_force_show_raw_image_button", getIntent().getBooleanExtra("key_force_show_raw_image_button", false));
                intent2.putExtra("key_is_raw_image_button_disable", getIntent().getBooleanExtra("key_is_raw_image_button_disable", false));
                String stringExtra = getIntent().getStringExtra("GalleryUI_FromUser");
                String stringExtra2 = getIntent().getStringExtra("GalleryUI_ToUser");
                if (!Util.isNullOrNil(stringExtra)) {
                    intent2.putExtra("GalleryUI_FromUser", stringExtra);
                }
                if (!Util.isNullOrNil(stringExtra2)) {
                    intent2.putExtra("GalleryUI_ToUser", stringExtra2);
                }
                intent2.putStringArrayListExtra("preview_image_list", stringArrayListExtra);
                startActivityForResult(intent2, 1);
            } else {
                intent.setClass(this, AlbumPreviewUI.class);
                if (intent.getBooleanExtra("need_to_clear_top", true)) {
                    intent.addFlags(67108864);
                }
                intent.putExtra("key_edit_text_color", getIntent().getStringExtra("key_edit_text_color"));
                intent.putExtra("send_btn_string", getIntent().getStringExtra("send_btn_string"));
                intent.putExtra("max_select_count", getIntent().getIntExtra("max_select_count", 9));
                intent.putExtra("GalleryUI_FromUser", getIntent().getStringExtra("GalleryUI_FromUser"));
                intent.putExtra("GalleryUI_ToUser", getIntent().getStringExtra("GalleryUI_ToUser"));
                intent.putExtra("key_send_raw_image", getIntent().getBooleanExtra("key_send_raw_image", false));
                intent.putExtra("key_force_hide_edit_image_button", getIntent().getBooleanExtra("key_force_hide_edit_image_button", false));
                intent.putExtra("key_force_show_raw_image_button", getIntent().getBooleanExtra("key_force_show_raw_image_button", false));
                intent.putExtra("key_is_raw_image_button_disable", getIntent().getBooleanExtra("key_is_raw_image_button_disable", false));
                intent.putExtra("GalleryUI_SkipVideoSizeLimit", getIntent().getBooleanExtra("GalleryUI_SkipVideoSizeLimit", false));
                intent.putExtra("album_business_tag", getIntent().getStringExtra("album_business_tag"));
                intent.putExtra("album_video_max_duration", getIntent().getIntExtra("album_video_max_duration", 10));
                intent.putExtra("album_video_min_duration", getIntent().getIntExtra("album_video_min_duration", 0));
                intent.putExtra("album_template_info", getIntent().getByteArrayExtra("album_template_info"));
                startActivityForResult(intent, 0);
            }
            this.f271350d = true;
        }
    }
}
