package com.tencent.p014mm.plugin.game.media;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ly1.C99730g0;
import nj3.C76879j;
import org.json.JSONArray;
import org.json.JSONException;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.game.media.GameTabGalleryUI */
public class GameTabGalleryUI extends MMActivity {

    /* renamed from: d */
    public C99730g0 f271746d;

    /* renamed from: com.tencent.mm.plugin.game.media.GameTabGalleryUI$a */
    public class C94098a implements MenuItem.OnMenuItemClickListener {
        public C94098a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameTabGalleryUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameTabGalleryUI$b */
    public class C94099b implements DialogInterface.OnClickListener {
        public C94099b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(GameTabGalleryUI.this.getContext());
            GameTabGalleryUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameTabGalleryUI$c */
    public class C94100c implements DialogInterface.OnClickListener {
        public C94100c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GameTabGalleryUI.this.finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public final void init() {
        this.f271746d = new C99730g0(getContext(), 38531);
        boolean booleanExtra = getIntent().getBooleanExtra("game_haowan_ignore_video_preview", true);
        int intExtra = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        C99730g0 g0Var = this.f271746d;
        g0Var.f292298o = booleanExtra;
        g0Var.f292299p = intExtra;
        String stringExtra = getIntent().getStringExtra("game_haowan_local_albums_info");
        JSONArray jSONArray = new JSONArray();
        if (!Util.isNullOrNil(stringExtra)) {
            try {
                jSONArray = new JSONArray(stringExtra);
            } catch (JSONException unused) {
            }
        }
        if (jSONArray.length() == 0) {
            jSONArray = C41853c.m45370d();
        }
        this.f271746d.setLocalAlbumInfos(jSONArray);
        setContentView((View) this.f271746d);
        setMMTitle((int) C0966R.string.f9b);
        setBackBtn(new C94098a());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 38531 && i2 == -1) {
            setResult(i2, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(C0966R.string.hif), getString(C0966R.string.f9e))) {
            init();
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C103928o.m138642b();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.GameTabGalleryUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.GameTabGalleryUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 145) {
            if (iArr[0] == 0) {
                init();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.fb9), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f360830f51), false, new C94099b(), new C94100c());
        }
    }

    public void onResume() {
        super.onResume();
        C103928o.m138641a(true, true, true);
    }
}
