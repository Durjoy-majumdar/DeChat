package vf1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dp1.C58408t0;
import er1.C58684b;
import er1.C7864r2;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import o40.C61926c;
import rx3.C13598b0;
import te3.C52271zj0;
import te3.C64638pv3;

/* renamed from: vf1.x4 */
public final class C65739x4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f189104d;

    /* renamed from: e */
    public final /* synthetic */ int f189105e;

    /* renamed from: f */
    public final /* synthetic */ String f189106f;

    /* renamed from: g */
    public final /* synthetic */ FinderSharePostUI f189107g;

    /* renamed from: h */
    public final /* synthetic */ String f189108h;

    /* renamed from: i */
    public final /* synthetic */ String f189109i;

    /* renamed from: j */
    public final /* synthetic */ String f189110j;

    /* renamed from: n */
    public final /* synthetic */ int f189111n;

    /* renamed from: o */
    public final /* synthetic */ String f189112o;

    /* renamed from: p */
    public final /* synthetic */ C52271zj0 f189113p;

    /* renamed from: q */
    public final /* synthetic */ C8477a0 f189114q;

    /* renamed from: r */
    public final /* synthetic */ String f189115r;

    /* renamed from: s */
    public final /* synthetic */ String f189116s;

    /* renamed from: t */
    public final /* synthetic */ C8479f0<String> f189117t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65739x4(String str, int i, String str2, FinderSharePostUI finderSharePostUI, String str3, String str4, String str5, int i2, String str6, C52271zj0 zj02, C8477a0 a0Var, String str7, String str8, C8479f0<String> f0Var) {
        super(0);
        this.f189104d = str;
        this.f189105e = i;
        this.f189106f = str2;
        this.f189107g = finderSharePostUI;
        this.f189108h = str3;
        this.f189109i = str4;
        this.f189110j = str5;
        this.f189111n = i2;
        this.f189112o = str6;
        this.f189113p = zj02;
        this.f189114q = a0Var;
        this.f189115r = str7;
        this.f189116s = str8;
        this.f189117t = f0Var;
    }

    public Object invoke() {
        FinderJumpInfo finderJumpInfo;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intent intent = new Intent();
        intent.putExtra("postType", 4);
        intent.putExtra("KEY_POST_REMOTE_URL", this.f189104d);
        intent.putExtra("KEY_POST_FROM_APPTYPE", this.f189105e);
        intent.putExtra("KEY_POST_FROM_APP_PARAMJSON", this.f189106f);
        intent.putExtra("key_finder_post_from", 8);
        intent.putExtra("KEY_POST_FROM_SHARE", this.f189107g.mo77442Q7().toByteArray());
        intent.putExtra("saveDesc", this.f189108h);
        intent.putExtra("KEY_POST_EXTEND_URL", this.f189109i);
        intent.putExtra("KEY_MIAOJIAN_EXTINFO", this.f189110j);
        intent.putExtra("KEY_POST_FROM_APP_SOURCE", this.f189111n);
        intent.putExtra("key_app_id", this.f189112o);
        intent.putExtra("key_activity_src_type", "key_scene_from_outside");
        C52271zj0 zj02 = this.f189113p;
        if (zj02 != null) {
            FinderContact finderContact = zj02.f146006e;
            intent.putExtra("key_topic_id", zj02.f146005d);
            intent.putExtra("key_activity_type", 102);
            if (finderContact == null || (str = finderContact.username) == null) {
                str = "";
            }
            intent.putExtra("key_user_name", str);
            if (finderContact == null || (str2 = finderContact.nickname) == null) {
                str2 = "";
            }
            intent.putExtra("key_nick_name", str2);
            if (finderContact == null || (str3 = finderContact.headUrl) == null) {
                str3 = "";
            }
            intent.putExtra("key_avatar_url", str3);
            String str7 = this.f189113p.f146010i;
            if (str7 == null) {
                str7 = "";
            }
            intent.putExtra("key_cover_url", str7);
            intent.putExtra("key_activity_display_mask", this.f189113p.f146022x);
            String str8 = this.f189113p.f146007f;
            if (str8 == null) {
                str8 = "";
            }
            intent.putExtra("key_activity_name", str8);
            String str9 = this.f189113p.f146008g;
            if (str9 == null) {
                str9 = "";
            }
            intent.putExtra("key_activity_desc", str9);
            intent.putExtra("key_activity_end_time", this.f189113p.f146018t);
            intent.putExtra("saveActivity", true);
            String str10 = this.f189107g.f159031o;
            StringBuilder sb = new StringBuilder();
            sb.append("eventInfo nickname = ");
            if (finderContact == null || (str4 = finderContact.nickname) == null) {
                str4 = "";
            }
            sb.append(str4);
            Log.m105924i(str10, sb.toString());
            String str11 = this.f189107g.f159031o;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("eventInfo eventname = ");
            C52271zj0 zj03 = this.f189113p;
            if (zj03 == null || (str5 = zj03.f146007f) == null) {
                str5 = "";
            }
            sb4.append(str5);
            Log.m105924i(str11, sb4.toString());
            String str12 = this.f189107g.f159031o;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("eventInfo description = ");
            C52271zj0 zj04 = this.f189113p;
            if (zj04 == null || (str6 = zj04.f146008g) == null) {
                str6 = "";
            }
            sb5.append(str6);
            Log.m105924i(str12, sb5.toString());
        }
        if (this.f189114q.f27482d) {
            intent.putExtra("isLongVideoPost", true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f189117t.f27484d);
        C13598b0 b0Var = C13598b0.f38549a;
        intent.putStringArrayListExtra("postMediaList", arrayList);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(11, 8, 74, intent);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, "");
        Log.m105924i(this.f189107g.f159031o, "from:" + this.f189115r);
        if (!C87412m.m108589b(this.f189115r, WeChatBrands.Business.GROUP_CHANNELS) || C58408t0.f167337b == null) {
            C58408t0.f167336a.mo83266l(8, false);
        } else {
            intent.putExtra("KEY_SHARE_VIDEO_SOURCE", 5);
        }
        if (C87412m.m108589b(this.f189115r, "channels-samestyle")) {
            intent.putExtra("KEY_SHARE_VIDEO_SOURCE", 6);
        }
        C64638pv3 pv32 = this.f189107g.mo77442Q7().f184201e;
        if (!(pv32 == null || (finderJumpInfo = pv32.f184896h) == null)) {
            Log.m105924i(this.f189107g.f159031o, "put jumpInfo, " + finderJumpInfo.jumpinfo_type);
            intent.putExtra("JUMP_INFO", finderJumpInfo.toByteArray());
        }
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        ((C58684b) C86312j.m106911c(C58684b.class)).Vx0(context, intent);
        String str13 = "success, rawPath:" + this.f189116s + ", path:" + C86013q1.m106448i((String) this.f189117t.f27484d, false) + " url:" + this.f189104d + ", fromApp:" + this.f189105e;
        C87412m.m108594g(str13, "wording");
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            C61926c.m72668M(new C7864r2(str13));
        }
        this.f189107g.overridePendingTransition(0, 0);
        this.f189107g.mo77439N7();
        return C13598b0.f38549a;
    }
}
