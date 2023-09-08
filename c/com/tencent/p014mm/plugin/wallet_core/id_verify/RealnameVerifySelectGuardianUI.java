package com.tencent.p014mm.plugin.wallet_core.id_verify;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.C74551q1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.C74572v;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.rtmp.TXLiveConstants;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;
import nj3.C88989a;
import o60.C100284b;
import p240sx.C77810t;
import p60.C100632a;
import p60.C100633b;
import t60.C101725g;
import te3.C50456mv3;
import te3.sg4;
import vo3.C90852c;
import wd3.C65953v0;
import x60.C102564a;
import z53.C53750h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet_core/id_verify/RealnameVerifySelectGuardianUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "a", "b", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(19)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI */
public final class RealnameVerifySelectGuardianUI extends MMBaseSelectContactUI {

    /* renamed from: E */
    public static final /* synthetic */ int f209043E = 0;

    /* renamed from: C */
    public final ArrayList<String> f209044C;

    /* renamed from: D */
    public final C72070b f209045D = new C72070b();

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI$a */
    public static final class C72068a {
        public C72068a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI$c */
    public static final class C72069c implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ RealnameVerifySelectGuardianUI f209046a;

        /* renamed from: b */
        public final /* synthetic */ String f209047b;

        public C72069c(RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, String str) {
            this.f209046a = realnameVerifySelectGuardianUI;
            this.f209047b = str;
        }

        /* renamed from: a */
        public final void mo23a(boolean z, String str, int i) {
            RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI = this.f209046a;
            String str2 = this.f209047b;
            C87412m.m108593f(str2, "username");
            int i2 = RealnameVerifySelectGuardianUI.f209043E;
            realnameVerifySelectGuardianUI.getClass();
            if (z) {
                if (!(str2.length() == 0)) {
                    String stringExtra = realnameVerifySelectGuardianUI.getIntent().getStringExtra("under_age_session_id");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    if (str == null) {
                        str = "";
                    }
                    C53750h hVar = new C53750h(str2, stringExtra, str);
                    AppCompatActivity context = realnameVerifySelectGuardianUI.getContext();
                    hVar.f221056i = true;
                    hVar.f221058n = context;
                    hVar.mo9225i().mo123420E(new C72144e(realnameVerifySelectGuardianUI, str2));
                }
            }
            this.f209046a.hideVKB();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI$b */
    public static final class C72070b extends C100284b<String> {

        /* renamed from: a */
        public final C100633b f209048a = new C100633b();

        /* renamed from: b */
        public final C100632a f209049b = new C100632a();

        /* renamed from: a */
        public void mo95802a(C102564a<String> aVar, C101725g gVar, C100284b.C100285a aVar2) {
            C87412m.m108594g(aVar, "url");
            C87412m.m108594g(gVar, "fileNameCreator");
            C87412m.m108594g(aVar2, "callback");
            this.f209048a.mo95802a(aVar, gVar, aVar2);
        }
    }

    static {
        new C72068a((C8480h) null);
    }

    public RealnameVerifySelectGuardianUI() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f209044C = arrayList;
        HashSet hashSet = new HashSet();
        hashSet.addAll(C74560s1.m89273b());
        hashSet.addAll(C45628s0.m50776h());
        hashSet.add(C75592q0.m90789s());
        arrayList.addAll(hashSet);
    }

    /* renamed from: g8 */
    public static final void m84499g8(RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, C50456mv3 mv32) {
        sg4 sg4;
        String str;
        realnameVerifySelectGuardianUI.getClass();
        if (!(mv32 == null || (str = mv32.f138231e) == null)) {
            C75228t.m90219L(realnameVerifySelectGuardianUI.getContext(), str, true);
        }
        if (mv32 != null && (sg4 = mv32.f138232f) != null) {
            C75228t.m90224Q(sg4.f141503d, sg4.f141504e, sg4.f141505f, TXLiveConstants.PUSH_EVT_ROOM_OUT);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r4 == null) goto L_0x001a;
     */
    /* renamed from: i8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m84500i8(com.tencent.p014mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI r3, java.lang.String r4) {
        /*
            androidx.appcompat.app.AppCompatActivity r0 = r3.getContext()
            qo3.a r1 = new qo3.a
            r1.<init>()
            if (r4 == 0) goto L_0x001a
            int r2 = r4.length()
            if (r2 <= 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r2 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            if (r4 != 0) goto L_0x0026
        L_0x001a:
            r4 = 2131838776(0x7f114738, float:1.9310785E38)
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r3 = "getString(R.string.wallet_app_err_system_busy_tip)"
            gy3.C87412m.m108593f(r4, r3)
        L_0x0026:
            r1.f225660q = r4
            r3 = 2131821617(0x7f110431, float:1.9275982E38)
            android.content.res.Resources r4 = al3.C0086a.m38a(r0)
            java.lang.String r3 = r4.getString(r3)
            r1.f225664u = r3
            qo3.g r3 = new qo3.g
            r4 = 2131887328(0x7f1204e0, float:1.940926E38)
            r3.<init>(r0, r4)
            r3.mo107525e(r1)
            r3.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.m84500i8(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI, java.lang.String):void");
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        C74526m1 Nv0 = ((C77810t) C86312j.m106911c(C77810t.class)).Nv0(this, this.f209044C, true, false, new C74572v());
        C87412m.m108593f(Nv0, "getService(ISelectContac… AlphabetContactOption())");
        return Nv0;
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C74551q1(this, this.f209044C, false, this.f218604A);
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        return new int[]{131072};
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        String string = getString(C0966R.string.ng9);
        C87412m.m108593f(string, "getString(R.string.wc_pa…rify_select_parent_title)");
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r7 == null) goto L_0x0056;
     */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64517R7(android.widget.AdapterView<?> r7, android.view.View r8, int r9, long r10) {
        /*
            r6 = this;
            android.widget.ListView r7 = r6.f218605d
            int r7 = r7.getHeaderViewsCount()
            int r9 = r9 - r7
            if (r9 >= 0) goto L_0x000a
            return
        L_0x000a:
            com.tencent.mm.ui.contact.i1 r7 = r6.mo103379N7()
            gl3.b r7 = r7.getItem(r9)
            if (r7 != 0) goto L_0x0015
            return
        L_0x0015:
            int r8 = r7.f222604a
            r10 = 2
            if (r8 == r10) goto L_0x001b
            return
        L_0x001b:
            java.lang.String r2 = r7.f222621r
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r7 == 0) goto L_0x003a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "empty username selected at "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.RealnameVerifySelectGuardianUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r7)
            return
        L_0x003a:
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r8 = "under_age_msg_preview_text"
            java.lang.String r7 = r7.getStringExtra(r8)
            if (r7 == 0) goto L_0x0056
            int r8 = r7.length()
            if (r8 <= 0) goto L_0x004f
            r8 = 1
            goto L_0x0050
        L_0x004f:
            r8 = 0
        L_0x0050:
            if (r8 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            if (r7 != 0) goto L_0x007c
        L_0x0056:
            androidx.appcompat.app.AppCompatActivity r7 = r6.getContext()
            java.lang.String r8 = "context"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 91
            r8.append(r9)
            r9 = 2131840123(0x7f114c7b, float:1.9313517E38)
            java.lang.String r7 = r7.getString(r9)
            r8.append(r7)
            r7 = 93
            r8.append(r7)
            java.lang.String r7 = r8.toString()
        L_0x007c:
            r3 = r7
            java.lang.String r7 = "intent.getStringExtra(KE…ltMsgPreviewText(context)"
            gy3.C87412m.m108593f(r3, r7)
            java.lang.Class<wc3.w> r7 = wc3.C78541w.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            r0 = r7
            wc3.w r0 = (wc3.C78541w) r0
            androidx.appcompat.app.AppCompatActivity r1 = r6.getContext()
            r7 = 2131821677(0x7f11046d, float:1.9276104E38)
            java.lang.String r4 = r6.getString(r7)
            com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI$c r5 = new com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI$c
            r5.<init>(r6, r2)
            qo3.g r7 = r0.mo108495hG(r1, r2, r3, r4, r5)
            r7.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.mo64517R7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return true;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return true;
    }
}
