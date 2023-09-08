package kd1;

import android.content.Intent;
import gy3.C8480h;
import java.io.Serializable;

/* renamed from: kd1.a */
public final class C9579a {

    /* renamed from: a */
    public static final C9580a f29816a = new C9580a((C8480h) null);

    /* renamed from: b */
    public static Intent f29817b;

    /* renamed from: kd1.a$a */
    public static final class C9580a {
        public C9580a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo10259a(Intent intent, Intent intent2) {
            int intExtra = intent.getIntExtra("key_activity_type", 0);
            boolean booleanExtra = intent.getBooleanExtra("saveActivity", false);
            if (intExtra == 102 && booleanExtra) {
                intent2.putExtra("saveActivity", true);
                intent2.putExtra("key_activity_type", 102);
                String stringExtra = intent.getStringExtra("key_user_name");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = str;
                }
                intent2.putExtra("key_user_name", stringExtra);
                String stringExtra2 = intent.getStringExtra("key_nick_name");
                if (stringExtra2 == null) {
                    stringExtra2 = str;
                }
                intent2.putExtra("key_nick_name", stringExtra2);
                String stringExtra3 = intent.getStringExtra("key_cover_url");
                if (stringExtra3 == null) {
                    stringExtra3 = str;
                }
                intent2.putExtra("key_cover_url", stringExtra3);
                String stringExtra4 = intent.getStringExtra("key_avatar_url");
                if (stringExtra4 == null) {
                    stringExtra4 = str;
                }
                intent2.putExtra("key_avatar_url", stringExtra4);
                intent2.putExtra("key_topic_id", intent.getLongExtra("key_topic_id", 0));
                String stringExtra5 = intent.getStringExtra("key_activity_name");
                if (stringExtra5 == null) {
                    stringExtra5 = str;
                }
                intent2.putExtra("key_activity_name", stringExtra5);
                String stringExtra6 = intent.getStringExtra("key_activity_desc");
                if (stringExtra6 == null) {
                    stringExtra6 = str;
                }
                intent2.putExtra("key_activity_desc", stringExtra6);
                String stringExtra7 = intent.getStringExtra("key_activity_post_wording");
                if (stringExtra7 != null) {
                    str = stringExtra7;
                }
                intent2.putExtra("key_activity_post_wording", str);
                intent2.putExtra("key_activity_end_time", intent.getLongExtra("key_activity_end_time", 0));
                intent2.putExtra("key_activity_src_type", "key_scene_from_profile");
                Serializable serializableExtra = intent.getSerializableExtra("key_activity_jump_info_list");
                if (serializableExtra != null) {
                    intent2.putExtra("key_activity_jump_info_list", serializableExtra);
                }
                intent2.putExtra("key_activity_display_mask", intent.getLongExtra("key_activity_display_mask", 0));
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_wording_info");
                if (byteArrayExtra != null) {
                    intent2.putExtra("key_wording_info", byteArrayExtra);
                }
            }
        }
    }
}
