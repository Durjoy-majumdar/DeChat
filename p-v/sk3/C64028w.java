package sk3;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C97625j3;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import js0.C9515s;
import kb0.C76529i;
import kg3.C76577a;
import kv1.C99254i;
import lb0.C88394b;
import nj3.C11184p0;
import nk3.C61801g;
import nk3.C61802h;
import nk3.C61805j;
import nk3.C61806k;
import ok3.C62066a;
import ok3.C62070e;
import qo3.C77407n;
import rk3.C63462a;

/* renamed from: sk3.w */
public final class C64028w extends C63994l0 implements C61806k, C61805j {

    /* renamed from: r */
    public C61802h f181540r;

    /* renamed from: s */
    public C20937c f181541s;

    /* renamed from: sk3.w$a */
    public static final class C64029a implements C88394b.C88411m {

        /* renamed from: d */
        public final /* synthetic */ C61801g f181542d;

        /* renamed from: e */
        public final /* synthetic */ C62066a f181543e;

        /* renamed from: f */
        public final /* synthetic */ C64028w f181544f;

        public C64029a(C61801g gVar, C62066a aVar, C64028w wVar) {
            this.f181542d = gVar;
            this.f181543e = aVar;
            this.f181544f = wVar;
        }

        /* renamed from: b */
        public void mo1907b() {
            C20828a.m22825b().mo32519h(this.f181543e.f176449m, ((C63966a) this.f181542d).f181354F, this.f181544f.f181541s);
        }

        /* renamed from: d */
        public void mo1908d() {
        }

        public String key() {
            return "SEARCH#" + C9515s.m9209a(this);
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                C20828a.m22825b().mo32519h(this.f181543e.f176449m, ((C63966a) this.f181542d).f181354F, this.f181544f.f181541s);
            } else {
                ((C63966a) this.f181542d).f181354F.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: sk3.w$b */
    public static final class C64030b implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ C64028w f181545d;

        /* renamed from: e */
        public final /* synthetic */ View f181546e;

        public C64030b(C64028w wVar, View view) {
            this.f181545d = wVar;
            this.f181546e = view;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0, this.f181545d.f181417f, 0, this.f181546e.getContext().getString(C0966R.string.n3j));
        }
    }

    /* renamed from: sk3.w$c */
    public static final class C64031c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C62070e f181547d;

        /* renamed from: e */
        public final /* synthetic */ C64028w f181548e;

        public C64031c(C62070e eVar, C64028w wVar) {
            this.f181547d = eVar;
            this.f181548e = wVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f181547d.f176459d);
            C64028w wVar = this.f181548e;
            wVar.mo88759g3(menuItem.getItemId(), b002, wVar.f181423o);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64028w(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59359o = C0966R.raw.app_brand_app_default_icon_for_tail;
        int b = C76577a.m92151b(MMApplicationContext.getContext(), 50);
        int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 50);
        bVar.f59354j = b;
        bVar.f59355k = b2;
        bVar.f59345a = true;
        this.f181541s = bVar.mo32666a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x022c  */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86728M0(android.view.View r19, int r20, ok3.C62070e r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r21
            java.lang.String r2 = "v"
            r3 = r19
            gy3.C87412m.m108594g(r3, r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r0, r2)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "FTSMultiItemAppBrandUIC"
            java.lang.String r6 = "[onItemClick] position:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
            r18.mo88760i3()
            rk3.a r7 = rk3.C63462a.f180011a
            r8 = 6
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            rk3.C63462a.m74799d(r7, r8, r9, r10, r11, r12)
            r3 = r0
            ok3.a r3 = (ok3.C62066a) r3
            java.lang.String r0 = r1.f181423o
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.mm.message.l$b r8 = r3.f176446j
            r9 = 0
            if (r8 == 0) goto L_0x0043
            java.lang.String r10 = r8.f195573f2
            goto L_0x0044
        L_0x0043:
            r10 = r9
        L_0x0044:
            r7[r5] = r10
            java.lang.String r10 = r3.f176445i
            r7[r2] = r10
            if (r8 == 0) goto L_0x0053
            int r8 = r8.f195653z2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0054
        L_0x0053:
            r8 = r9
        L_0x0054:
            r10 = 2
            r7[r10] = r8
            java.lang.String r8 = "username: %s , appid %s ,pkgType : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r7)
            java.lang.String r7 = r1.f181423o
            java.lang.String r8 = r3.f176460e
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            r11 = 9
            java.lang.String r12 = "stat_scene"
            r15.putInt(r12, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "msg_"
            r11.append(r14)
            long r12 = r3.f176447k
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "stat_msg_id"
            r15.putString(r12, r11)
            java.lang.String r11 = "stat_chat_talker_username"
            r15.putString(r11, r7)
            java.lang.String r11 = "stat_send_msg_user"
            r15.putString(r11, r8)
            com.tencent.mm.message.l$b r11 = r3.f176446j
            if (r11 != 0) goto L_0x0099
            goto L_0x033a
        L_0x0099:
            int r11 = r11.f195581h2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            if (r11 != 0) goto L_0x00a3
            goto L_0x0118
        L_0x00a3:
            int r12 = r11.intValue()
            if (r12 != r2) goto L_0x0118
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            com.tencent.mm.message.l$b r11 = r3.f176446j
            if (r11 == 0) goto L_0x00b5
            java.lang.String r11 = r11.f195573f2
            goto L_0x00b6
        L_0x00b5:
            r11 = r9
        L_0x00b6:
            java.lang.String r12 = "key_username"
            r6.putExtra(r12, r11)
            java.lang.String r11 = "key_scene_note"
            java.lang.String r12 = "key_from_scene"
            if (r0 == 0) goto L_0x00dc
            r6.putExtra(r12, r2)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r7 = 58
            r12.append(r7)
            r12.append(r8)
            java.lang.String r7 = r12.toString()
            r6.putExtra(r11, r7)
            goto L_0x00e2
        L_0x00dc:
            r6.putExtra(r12, r10)
            r6.putExtra(r11, r7)
        L_0x00e2:
            java.lang.String r7 = "_stat_obj"
            r6.putExtra(r7, r15)
            com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b r7 = new com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b
            r7.<init>()
            java.lang.String r8 = r3.f176445i
            r7.f239557a = r8
            r8 = 6
            r7.f239566j = r8
            com.tencent.mm.message.l$b r8 = r3.f176446j
            gy3.C87412m.m108591d(r8)
            int r8 = r8.f195653z2
            r7.f239564h = r8
            com.tencent.mm.message.l$b r8 = r3.f176446j
            gy3.C87412m.m108591d(r8)
            r7.f239563g = r5
            com.tencent.mm.plugin.appbrand.config.WxaExposedParams r7 = r7.mo113977a()
            java.lang.String r8 = "key_scene_exposed_params"
            r6.putExtra(r8, r7)
            androidx.appcompat.app.AppCompatActivity r7 = r18.getActivity()
            java.lang.String r8 = "appbrand"
            java.lang.String r11 = ".ui.AppBrandProfileUI"
            ke3.C88144b.m109791i(r7, r8, r11, r6, r9)
            goto L_0x0135
        L_0x0118:
            if (r11 != 0) goto L_0x011b
            goto L_0x0127
        L_0x011b:
            int r12 = r11.intValue()
            if (r12 != r10) goto L_0x0127
            com.tencent.mm.message.l$b r6 = r3.f176446j
            kb0.C88132b.m109736f(r7, r8, r0, r6, r15)
            goto L_0x0135
        L_0x0127:
            if (r11 != 0) goto L_0x012a
            goto L_0x0137
        L_0x012a:
            int r11 = r11.intValue()
            if (r11 != r6) goto L_0x0137
            com.tencent.mm.message.l$b r6 = r3.f176446j
            kb0.C88132b.m109737g(r7, r8, r0, r6, r15)
        L_0x0135:
            r6 = 0
            goto L_0x0138
        L_0x0137:
            r6 = 1
        L_0x0138:
            if (r6 == 0) goto L_0x016a
            com.tencent.mm.message.l$b r7 = r3.f176446j
            if (r7 == 0) goto L_0x0146
            int r7 = r7.f195582i
            r8 = 36
            if (r7 != r8) goto L_0x0146
            r7 = 1
            goto L_0x0147
        L_0x0146:
            r7 = 0
        L_0x0147:
            if (r7 == 0) goto L_0x016a
            java.lang.Class<kr0.x0> r6 = kr0.C76630x0.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            r11 = r6
            kr0.x0 r11 = (kr0.C76630x0) r11
            androidx.appcompat.app.AppCompatActivity r12 = r18.getActivity()
            java.lang.String r13 = r1.f181423o
            java.lang.String r6 = r3.f176460e
            r7 = 1
            com.tencent.mm.message.l$b r8 = r3.f176446j
            r9 = r14
            r14 = r6
            r6 = r15
            r15 = r7
            r16 = r8
            r17 = r6
            r11.mo106897rj(r12, r13, r14, r15, r16, r17)
            r6 = 0
            goto L_0x016b
        L_0x016a:
            r9 = r14
        L_0x016b:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            r7[r5] = r8
            java.lang.String r8 = "goDefaultClickAction %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r7)
            if (r6 != 0) goto L_0x017c
            goto L_0x033a
        L_0x017c:
            if (r6 == 0) goto L_0x033a
            com.tencent.mm.message.l$b r6 = r3.f176446j
            if (r6 == 0) goto L_0x0185
            java.lang.String r6 = r6.f195586j
            goto L_0x0186
        L_0x0185:
            r6 = 0
        L_0x0186:
            if (r6 == 0) goto L_0x0191
            int r6 = r6.length()
            if (r6 != 0) goto L_0x018f
            goto L_0x0191
        L_0x018f:
            r6 = 0
            goto L_0x0192
        L_0x0191:
            r6 = 1
        L_0x0192:
            if (r6 != 0) goto L_0x033a
            java.lang.Class<ym.p> r6 = p763ym.C79139p.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ym.p r6 = (p763ym.C79139p) r6
            com.tencent.mm.message.l$b r7 = r3.f176446j
            if (r7 == 0) goto L_0x01a3
            java.lang.String r7 = r7.f195586j
            goto L_0x01a4
        L_0x01a3:
            r7 = 0
        L_0x01a4:
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "groupmessage"
            goto L_0x01ac
        L_0x01a9:
            java.lang.String r0 = "singlemessage"
        L_0x01ac:
            java.lang.String r0 = r6.mo108862K3(r7, r0)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r7 = "rawUrl"
            r6.putExtra(r7, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x01c1
            java.lang.String r0 = r0.f195570f
            goto L_0x01c2
        L_0x01c1:
            r0 = 0
        L_0x01c2:
            java.lang.String r7 = "webpageTitle"
            r6.putExtra(r7, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            com.tencent.mm.message.l$b r8 = r3.f176446j
            if (r8 == 0) goto L_0x01d3
            java.lang.String r8 = r8.f195562d
            goto L_0x01d4
        L_0x01d3:
            r8 = 0
        L_0x01d4:
            java.lang.String r11 = "context"
            gy3.C87412m.m108594g(r0, r11)
            if (r8 == 0) goto L_0x01e3
            int r11 = r8.length()
            if (r11 != 0) goto L_0x01e2
            goto L_0x01e3
        L_0x01e2:
            r2 = 0
        L_0x01e3:
            if (r2 == 0) goto L_0x01e6
            goto L_0x01f7
        L_0x01e6:
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            com.tencent.mm.pluginsdk.model.app.j r2 = r2.getAppInfo(r8)
            if (r2 == 0) goto L_0x01f7
            java.lang.String r2 = r2.field_packageName
            goto L_0x01f8
        L_0x01f7:
            r2 = 0
        L_0x01f8:
            if (r2 != 0) goto L_0x01fb
            goto L_0x020c
        L_0x01fb:
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0204 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r5)     // Catch:{ NameNotFoundException -> 0x0204 }
            goto L_0x020d
        L_0x0204:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r8, r2)
        L_0x020c:
            r0 = 0
        L_0x020d:
            if (r0 == 0) goto L_0x0212
            java.lang.String r2 = r0.versionName
            goto L_0x0213
        L_0x0212:
            r2 = 0
        L_0x0213:
            java.lang.String r4 = "version_name"
            r6.putExtra(r4, r2)
            if (r0 == 0) goto L_0x021e
            int r0 = r0.versionCode
            goto L_0x021f
        L_0x021e:
            r0 = 0
        L_0x021f:
            java.lang.String r2 = "version_code"
            r6.putExtra(r2, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x022c
            java.lang.String r0 = r0.f195586j
            goto L_0x022d
        L_0x022c:
            r0 = 0
        L_0x022d:
            java.lang.String r2 = "shortUrl"
            r6.putExtra(r2, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x023a
            java.lang.String r0 = r0.f195634v
            goto L_0x023b
        L_0x023a:
            r0 = 0
        L_0x023b:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x025d
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x0248
            java.lang.String r0 = r0.f195634v
            goto L_0x0249
        L_0x0248:
            r0 = 0
        L_0x0249:
            java.lang.String r2 = "srcUsername"
            r6.putExtra(r2, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x0256
            java.lang.String r0 = r0.f195638w
            goto L_0x0257
        L_0x0256:
            r0 = 0
        L_0x0257:
            java.lang.String r2 = "srcDisplayname"
            r6.putExtra(r2, r0)
        L_0x025d:
            long r11 = r3.f176459d
            java.lang.String r0 = "msg_id"
            r6.putExtra(r0, r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            long r11 = r3.f176447k
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "KPublisherId"
            r6.putExtra(r2, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x0281
            java.lang.String r0 = r0.f195562d
            goto L_0x0282
        L_0x0281:
            r0 = 0
        L_0x0282:
            java.lang.String r2 = "KAppId"
            r6.putExtra(r2, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x028e
            java.lang.String r0 = r0.f195570f
            goto L_0x028f
        L_0x028e:
            r0 = 0
        L_0x028f:
            r6.putExtra(r7, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x0299
            java.lang.String r0 = r0.f195646y
            goto L_0x029a
        L_0x0299:
            r0 = 0
        L_0x029a:
            java.lang.String r2 = "thumbUrl"
            r6.putExtra(r2, r0)
            java.lang.String r0 = r1.f181423o
            java.lang.String r2 = "geta8key_username"
            r6.putExtra(r2, r0)
            java.lang.String r0 = r3.f176460e
            java.lang.String r2 = "pre_username"
            r6.putExtra(r2, r0)
            java.lang.String r0 = "from_scence"
            r6.putExtra(r0, r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            long r7 = r3.f176447k
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "prePublishId"
            r6.putExtra(r2, r0)
            java.lang.String r0 = r3.f176460e
            java.lang.String r2 = "preUsername"
            r6.putExtra(r2, r0)
            java.lang.String r0 = r1.f181423o
            java.lang.String r2 = "preChatName"
            r6.putExtra(r2, r0)
            java.lang.String r0 = "preChatTYPE"
            r6.putExtra(r0, r10)
            java.lang.String r0 = "preMsgIndex"
            r6.putExtra(r0, r5)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x02e8
            java.lang.String r0 = r0.f195586j
            goto L_0x02e9
        L_0x02e8:
            r0 = 0
        L_0x02e9:
            java.lang.String r2 = "share_report_pre_msg_url"
            r6.putExtra(r2, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x02f6
            java.lang.String r0 = r0.f195570f
            goto L_0x02f7
        L_0x02f6:
            r0 = 0
        L_0x02f7:
            java.lang.String r2 = "share_report_pre_msg_title"
            r6.putExtra(r2, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x0304
            java.lang.String r0 = r0.f195574g
            goto L_0x0305
        L_0x0304:
            r0 = 0
        L_0x0305:
            java.lang.String r2 = "share_report_pre_msg_desc"
            r6.putExtra(r2, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x0312
            java.lang.String r0 = r0.f195646y
            goto L_0x0313
        L_0x0312:
            r0 = 0
        L_0x0313:
            java.lang.String r2 = "share_report_pre_msg_icon_url"
            r6.putExtra(r2, r0)
            com.tencent.mm.message.l$b r0 = r3.f176446j
            if (r0 == 0) goto L_0x0320
            java.lang.String r0 = r0.f195562d
            goto L_0x0321
        L_0x0320:
            r0 = 0
        L_0x0321:
            java.lang.String r2 = "share_report_pre_msg_appid"
            r6.putExtra(r2, r0)
            java.lang.String r0 = "share_report_from_scene"
            r6.putExtra(r0, r10)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            java.lang.String r2 = "webview"
            java.lang.String r3 = ".ui.tools.WebViewUI"
            r4 = 0
            ke3.C88144b.m109791i(r0, r2, r3, r6, r4)
        L_0x033a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sk3.C64028w.mo86728M0(android.view.View, int, ok3.e):void");
    }

    /* renamed from: R1 */
    public void mo86729R1(View view, int i, C62070e eVar) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(eVar, "item");
        Log.m105925i("FTSMultiItemAppBrandUIC", "[onItemLongClick] position:%s", Integer.valueOf(i));
        C63462a.f180011a.mo88328b(14);
        new C45082x0(view.getContext()).mo70436b(view, new C64030b(this, view), new C64031c(eVar, this), (C77407n.C47880p) null);
    }

    /* renamed from: V0 */
    public void mo86730V0(C61801g gVar, int i, int i2) {
        C80995a aVar;
        C87412m.m108594g(gVar, "holder");
        C62066a aVar2 = (C62066a) getItem(i);
        C63966a aVar3 = (C63966a) gVar;
        C68070l.C68072b bVar = aVar2.f176446j;
        if (!(bVar == null || (aVar = (C80995a) bVar.mo93555w(C80995a.class)) == null || aVar.f237911t != 1)) {
            aVar3.f181355G.setVisibility(0);
        }
        if (Util.isNullOrNil(aVar2.f176448l)) {
            aVar3.f181356H.setVisibility(8);
            C20828a.m22825b().mo32519h(aVar2.f176449m, aVar3.f181354F, this.f181541s);
            return;
        }
        aVar3.f181356H.setVisibility(0);
        aVar3.f181356H.setText(aVar2.f176458c);
        gVar.f175723D.setText(aVar2.f176448l);
        TextView textView = aVar3.f181356H;
        C61802h hVar = this.f181540r;
        gVar.mo86724y(textView, hVar != null ? hVar.f175729g : null);
        if (!Util.isNullOrNil(aVar2.f176450n)) {
            String str = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122797p(new C64029a(gVar, aVar2, this), aVar2.f176450n, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(C76529i.class)).Ij0(45, 45));
            return;
        }
        C20828a.m22825b().mo32519h(aVar2.f176449m, aVar3.f181354F, this.f181541s);
    }

    /* renamed from: c3 */
    public SpannableString mo88749c3() {
        String str = ((C64004q0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C64004q0.class)).f181449f;
        Log.m105924i("FTSMultiItemAppBrandUIC", "getEmptyResultString >> " + str);
        return C99254i.m129316m(getString(C0966R.string.mhl), getString(C0966R.string.mhg), str);
    }

    /* renamed from: d3 */
    public C61802h mo88750d3() {
        if (this.f181540r == null) {
            this.f181540r = new C61802h(getActivity(), this, this);
        }
        C61802h hVar = this.f181540r;
        C87412m.m108591d(hVar);
        return hVar;
    }

    public int getCount() {
        return this.f181421j.size();
    }

    public C62070e getItem(int i) {
        C62070e eVar = this.f181421j.get(i);
        C87412m.m108593f(eVar, "normalDataList[position]");
        return eVar;
    }

    /* renamed from: o */
    public RecyclerView.C16631z mo86733o(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cvv, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…list_item, parent, false)");
        return new C63966a(inflate);
    }
}
