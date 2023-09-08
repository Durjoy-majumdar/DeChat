package np0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import au0.C67108b;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d62.C7240a;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.lang.ref.WeakReference;
import js0.C76448t;
import kb0.C33864j;
import kb0.C33865k;
import kr0.C76629w0;
import lb0.C88394b;
import v90.C37702d;
import v90.C78376c;
import wd3.C53155r0;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: np0.o */
public class C76947o extends C86301e implements C33864j {

    /* renamed from: np0.o$a */
    public class C76948a extends C7240a {

        /* renamed from: e */
        public final /* synthetic */ C78376c f224862e;

        /* renamed from: f */
        public final /* synthetic */ String f224863f;

        /* renamed from: g */
        public final /* synthetic */ int f224864g;

        /* renamed from: h */
        public final /* synthetic */ long f224865h;

        /* renamed from: i */
        public final /* synthetic */ String f224866i;

        /* renamed from: np0.o$a$a */
        public class C76949a implements C76629w0.C61144a {
            public C76949a() {
            }

            /* renamed from: a */
            public void mo21208a(WxaAttributes wxaAttributes) {
                C37702d Ag = ((C33865k) C86312j.m106911c(C33865k.class)).mo59335Ag(C76948a.this.f224862e.f229678h);
                WxaUpdatableMsgReportStruct.C80798d dVar = WxaUpdatableMsgReportStruct.C80798d.f237491e;
                WxaUpdatableMsgReportStruct.C80799e eVar = WxaUpdatableMsgReportStruct.C80799e.f237496e;
                if (Ag != null) {
                    int i = Ag.field_msgState;
                    if (i == 1) {
                        dVar = WxaUpdatableMsgReportStruct.C80798d.f237493g;
                    } else if (i == 0) {
                        dVar = WxaUpdatableMsgReportStruct.C80798d.f237492f;
                    }
                    int i2 = Ag.field_btnState;
                    if (i2 == 2) {
                        eVar = WxaUpdatableMsgReportStruct.C80799e.f237498g;
                    } else if (i2 == 0 || i2 == 1) {
                        eVar = WxaUpdatableMsgReportStruct.C80799e.f237497f;
                    }
                }
                int i3 = wxaAttributes.mo113940m2() == null ? 0 : wxaAttributes.mo113940m2().f239488d;
                WxaUpdatableMsgReportStruct wxaUpdatableMsgReportStruct = new WxaUpdatableMsgReportStruct();
                wxaUpdatableMsgReportStruct.f237460d = wxaUpdatableMsgReportStruct.mo86045b("AppId", C76948a.this.f224862e.f229674d, true);
                wxaUpdatableMsgReportStruct.f237461e = wxaUpdatableMsgReportStruct.mo86045b("PageId", C76948a.this.f224862e.f229676f, true);
                wxaUpdatableMsgReportStruct.f237463g = wxaUpdatableMsgReportStruct.mo86045b("ShareTicket", C76948a.this.f224862e.f229676f, true);
                wxaUpdatableMsgReportStruct.f237464h = wxaUpdatableMsgReportStruct.mo86045b("ChattingId", C76948a.this.f224863f, true);
                wxaUpdatableMsgReportStruct.f237465i = C76948a.this.f224863f.toLowerCase().endsWith("@chatroom") ? WxaUpdatableMsgReportStruct.C80797c.f237487e : WxaUpdatableMsgReportStruct.C80797c.f237488f;
                wxaUpdatableMsgReportStruct.f237466j = WxaUpdatableMsgReportStruct.C80796b.f237484h;
                wxaUpdatableMsgReportStruct.f237467k = 0;
                wxaUpdatableMsgReportStruct.f237468l = wxaUpdatableMsgReportStruct.mo86045b("SceneNote", "", true);
                wxaUpdatableMsgReportStruct.f237471o = WxaUpdatableMsgReportStruct.C80795a.m98639a(i3 + 1000);
                long nowMilliSecond = Util.nowMilliSecond();
                wxaUpdatableMsgReportStruct.f237462f = nowMilliSecond;
                wxaUpdatableMsgReportStruct.mo86048e("ActionTimeStampMs", nowMilliSecond);
                wxaUpdatableMsgReportStruct.f237469m = dVar;
                wxaUpdatableMsgReportStruct.f237470n = eVar;
                wxaUpdatableMsgReportStruct.mo86054n();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76948a(C76947o oVar, int i, C53155r0 r0Var, C78376c cVar, String str, int i2, long j, String str2) {
            super(i, r0Var);
            this.f224862e = cVar;
            this.f224863f = str;
            this.f224864g = i2;
            this.f224865h = j;
            this.f224866i = str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0081, code lost:
            r0 = android.util.Base64.decode(r12.f224862e.f229676f, 2);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1118a(android.view.View r13) {
            /*
                r12 = this;
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                v90.c r1 = r12.f224862e
                java.lang.String r2 = r1.f229671a
                r3 = 0
                r0[r3] = r2
                java.lang.String r2 = r1.f229675e
                r3 = 1
                r0[r3] = r2
                java.lang.String r1 = r1.f229676f
                r2 = 2
                r0[r2] = r1
                java.lang.String r1 = r12.f224863f
                r3 = 3
                r0[r3] = r1
                java.lang.String r1 = "MicroMsg.WxaSubscribeMsgService"
                java.lang.String r3 = "On Span clicked(title : %s, username : %s, path : %s, talker : %s)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                int r1 = r12.f224864g
                java.lang.String r3 = "stat_scene"
                r0.putInt(r3, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "msg_"
                r1.append(r3)
                long r3 = r12.f224865h
                java.lang.String r3 = java.lang.Long.toString(r3)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.String r3 = "stat_msg_id"
                r0.putString(r3, r1)
                java.lang.String r1 = r12.f224863f
                java.lang.String r3 = "stat_chat_talker_username"
                r0.putString(r3, r1)
                java.lang.String r1 = r12.f224866i
                java.lang.String r3 = "stat_send_msg_user"
                r0.putString(r3, r1)
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r11 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
                r11.<init>()
                r1 = 1231(0x4cf, float:1.725E-42)
                r11.f245533f = r1
                java.lang.String r3 = "0"
                r11.f245534g = r3
                int r1 = com.tencent.p014mm.plugin.appbrand.report.C68633w.m80874a(r1, r0)
                r11.f245531d = r1
                int r1 = r11.f245533f
                java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.report.C68633w.m80875b(r1, r0)
                r11.f245532e = r0
                v90.c r0 = r12.f224862e
                java.lang.String r0 = r0.f229676f
                if (r0 == 0) goto L_0x0092
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0092
                v90.c r0 = r12.f224862e
                java.lang.String r0 = r0.f229676f
                byte[] r0 = android.util.Base64.decode(r0, r2)
                if (r0 == 0) goto L_0x0092
                java.lang.String r1 = new java.lang.String
                r1.<init>(r0)
                r10 = r1
                goto L_0x0095
            L_0x0092:
                java.lang.String r0 = ""
                r10 = r0
            L_0x0095:
                java.lang.Class<kr0.x0> r0 = kr0.C76630x0.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                r4 = r0
                kr0.x0 r4 = (kr0.C76630x0) r4
                android.content.Context r5 = r13.getContext()
                v90.c r13 = r12.f224862e
                java.lang.String r6 = r13.f229675e
                r7 = 0
                int r8 = r13.f229677g
                r9 = 0
                r4.Ko0(r5, r6, r7, r8, r9, r10, r11)
                java.lang.Class<kr0.w0> r13 = kr0.C76629w0.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                kr0.w0 r13 = (kr0.C76629w0) r13
                v90.c r0 = r12.f224862e
                java.lang.String r0 = r0.f229675e
                np0.o$a$a r1 = new np0.o$a$a
                r1.<init>()
                r13.mo106884tG(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: np0.C76947o.C76948a.mo1118a(android.view.View):void");
        }
    }

    /* renamed from: np0.o$b */
    public class C76950b implements C88394b.C88411m {

        /* renamed from: d */
        public final /* synthetic */ WeakReference f224868d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference f224869e;

        /* renamed from: f */
        public final /* synthetic */ SpannableString f224870f;

        public C76950b(C76947o oVar, WeakReference weakReference, WeakReference weakReference2, SpannableString spannableString) {
            this.f224868d = weakReference;
            this.f224869e = weakReference2;
            this.f224870f = spannableString;
        }

        /* renamed from: b */
        public void mo1907b() {
        }

        /* renamed from: d */
        public void mo1908d() {
        }

        public String key() {
            return C76947o.class.getSimpleName();
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            NeatTextView neatTextView = (NeatTextView) this.f224868d.get();
            Context context = (Context) this.f224869e.get();
            if (context != null && neatTextView != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                bitmapDrawable.setBounds(0, 0, C76448t.m91870a(16), C76448t.m91870a(16));
                C67108b bVar = new C67108b(bitmapDrawable, 1);
                SpannableString spannableString = new SpannableString("@ ");
                spannableString.setSpan(bVar, 0, 1, 33);
                neatTextView.mo104279b(TextUtils.concat(new CharSequence[]{spannableString, this.f224870f}));
                neatTextView.invalidate();
            }
        }
    }

    /* renamed from: Zq */
    public CharSequence mo59334Zq(String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        Bundle bundle2 = bundle;
        C78376c a = C78376c.m94639a(str);
        Context context = weakReference.get();
        if (context == null) {
            Log.m105928w("MicroMsg.WxaSubscribeMsgService", "context is null");
            return null;
        }
        String str2 = a.f229671a;
        if (Util.isNullOrNil(str2)) {
            Log.m105928w("MicroMsg.WxaSubscribeMsgService", "content is null, return");
            return null;
        }
        String string = bundle2 != null ? bundle2.getString("conv_talker_username") : "";
        int i = bundle2 != null ? bundle2.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : 0;
        long j = bundle2 != null ? bundle2.getLong("msg_sever_id") : 0;
        String string2 = bundle2 != null ? bundle2.getString("send_msg_username") : "";
        C76948a aVar = r0;
        SpannableString spannableString = new SpannableString(str2);
        C76948a aVar2 = new C76948a(this, 1, (C53155r0) null, a, string, i, j, string2);
        SpannableString spannableString2 = spannableString;
        spannableString2.setSpan(aVar, str2.indexOf(a.f229673c), str2.indexOf(a.f229673c) + a.f229673c.length(), 17);
        Log.m105925i("MicroMsg.WxaSubscribeMsgService", "wxaSubscribeSysContent.forbids:%d", Integer.valueOf(a.f229679i));
        if (a.f229679i == 1) {
            return spannableString2;
        }
        WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(a.f229675e);
        String str3 = N2 != null ? N2.field_brandIconURL : "";
        String str4 = C88394b.f255384g;
        C88394b bVar = C88394b.C88418q.f255427a;
        Bitmap g = bVar.mo122791g(str3, (C88394b.C88405h) null);
        if (g == null) {
            bVar.mo122796o(new C76950b(this, weakReference2, weakReference, spannableString2), str3, (C88394b.C88408j) null);
            return TextUtils.concat(new CharSequence[]{vx0(context, a.f229680j, (Bitmap) null), spannableString2});
        }
        return TextUtils.concat(new CharSequence[]{vx0(context, a.f229680j, g), spannableString2});
    }

    public final SpannableString vx0(Context context, int i, Bitmap bitmap) {
        Drawable drawable;
        if (bitmap == null) {
            drawable = context.getResources().getDrawable(i == 1 ? C0966R.raw.spannable_wxa_game_link_logo : C0966R.raw.spannable_app_brand_link_logo);
        } else {
            drawable = new BitmapDrawable(context.getResources(), bitmap);
        }
        drawable.setBounds(0, 0, C76448t.m91870a(16), C76448t.m91870a(16));
        C67108b bVar = new C67108b(drawable, 1);
        SpannableString spannableString = new SpannableString("@ ");
        spannableString.setSpan(bVar, 0, 1, 33);
        return spannableString;
    }
}
