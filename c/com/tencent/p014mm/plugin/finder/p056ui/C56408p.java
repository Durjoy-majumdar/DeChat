package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60165e4;
import ht1.C60200t1;
import ht1.C60216z4;
import jh2.C9434j;
import org.json.JSONObject;
import p599lr.C61381b;
import qo1.C63293i;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C64726td1;

/* renamed from: com.tencent.mm.plugin.finder.ui.p */
public final class C56408p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f161254d;

    /* renamed from: e */
    public final /* synthetic */ String f161255e;

    /* renamed from: f */
    public final /* synthetic */ FinderAlbumUI f161256f;

    /* renamed from: g */
    public final /* synthetic */ C64726td1 f161257g;

    /* renamed from: h */
    public final /* synthetic */ C9434j f161258h;

    /* renamed from: i */
    public final /* synthetic */ C89779i0 f161259i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56408p(boolean z, String str, FinderAlbumUI finderAlbumUI, C64726td1 td12, C9434j jVar, C89779i0 i0Var) {
        super(0);
        this.f161254d = z;
        this.f161255e = str;
        this.f161256f = finderAlbumUI;
        this.f161257g = td12;
        this.f161258h = jVar;
        this.f161259i = i0Var;
    }

    public Object invoke() {
        if (this.f161254d) {
            if (!C86013q1.m106450k(this.f161255e) || C86013q1.m106451l(this.f161255e) <= 0) {
                Log.m105920e("Finder.AlbumUI", "onHeaderClicked: download file error");
            } else {
                FinderAlbumUI finderAlbumUI = this.f161256f;
                C64726td1 td12 = this.f161257g;
                C9434j jVar = this.f161258h;
                int i = FinderAlbumUI.f161014F1;
                finderAlbumUI.getClass();
                Log.m105924i("Finder.AlbumUI", "enterFollowMusicTake() called with: musicInfo = " + td12 + ", audioInfo = " + jVar);
                Intent intent = new Intent();
                intent.putExtra("key_finder_post_router", 2);
                String str = td12.f185546s;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", str);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", jVar.mo10149g0());
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", td12.toByteArray());
                intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", false);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", td12.f185539i);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", String.valueOf(td12.f185536f));
                intent.putExtra("key_finder_post_from", finderAlbumUI.getIntent().getIntExtra("key_finder_post_from", 5));
                intent.putExtra("key_finder_post_id", finderAlbumUI.f161020y1);
                intent.putExtra("KEY_FINDER_POST_MUSIC_NEED_FINISH", true);
                C63293i Yp0 = ((C61381b) C86312j.m106911c(C61381b.class)).Yp0();
                AppCompatActivity context = finderAlbumUI.getContext();
                C87412m.m108593f(context, "context");
                Yp0.mo88190b(context, intent, Integer.valueOf(JsApiOperateRecorder.CTRL_INDEX));
                C60216z4 l7 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7();
                JSONObject jSONObject = new JSONObject();
                String str3 = td12.f185546s;
                if (str3 != null) {
                    str2 = str3;
                }
                jSONObject.put("songid", str2);
                C13598b0 b0Var = C13598b0.f38549a;
                l7.mo83788g6("material_shot", 1, jSONObject, ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85166dj(finderAlbumUI));
            }
        }
        C89779i0 i0Var = this.f161259i;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        return C13598b0.f38549a;
    }
}
