package mk1;

import a14.C53916l;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Result;
import nd3.C88930e;
import qo3.C47883u;

/* renamed from: mk1.i */
public final class C10922i implements C88930e {

    /* renamed from: a */
    public final /* synthetic */ C10906h f32569a;

    /* renamed from: b */
    public final /* synthetic */ C53916l<Boolean> f32570b;

    /* renamed from: mk1.i$a */
    public static final class C10923a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C10906h f32571a;

        public C10923a(C10906h hVar) {
            this.f32571a = hVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            String str2 = this.f32571a.f32537d;
            Log.m105924i(str2, "showAlertDialog click bOk:" + z + ",text:" + str);
        }
    }

    /* renamed from: mk1.i$b */
    public static final class C10924b implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C53916l<Boolean> f32572d;

        public C10924b(C53916l<? super Boolean> lVar) {
            this.f32572d = lVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C53916l<Boolean> lVar = this.f32572d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
    }

    public C10922i(C10906h hVar, C53916l<? super Boolean> lVar) {
        this.f32569a = hVar;
        this.f32570b = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if ((!(r5.length == 0)) == true) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r3, java.lang.String[] r4, int[] r5) {
        /*
            r2 = this;
            mk1.h r4 = r2.f32569a
            java.lang.String r4 = r4.f32537d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onRequestPermissionsResult requestCode:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r4 = 16
            if (r3 != r4) goto L_0x00a7
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L_0x002a
            int r1 = r5.length
            if (r1 != 0) goto L_0x0025
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            r1 = r1 ^ r4
            if (r1 != r4) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            if (r4 == 0) goto L_0x003f
            r4 = r5[r0]
            if (r4 != 0) goto L_0x003f
            a14.l<java.lang.Boolean> r3 = r2.f32570b
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r4)
            r3.resumeWith(r4)
            goto L_0x00b4
        L_0x003f:
            mk1.h r4 = r2.f32569a
            java.lang.String r4 = r4.f32537d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FinderLive request permission "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " failed"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            qo3.q r3 = new qo3.q
            mk1.h r4 = r2.f32569a
            com.tencent.mm.ui.MMFragmentActivity r4 = r4.f32534a
            r3.<init>(r4)
            mk1.h r4 = r2.f32569a
            com.tencent.mm.ui.MMFragmentActivity r4 = r4.f32534a
            r5 = 2131828454(0x7f111ee6, float:1.928985E38)
            java.lang.String r4 = r4.getString(r5)
            r3.mo107606r(r4)
            mk1.h r4 = r2.f32569a
            com.tencent.mm.ui.MMFragmentActivity r4 = r4.f32534a
            r5 = 2131828453(0x7f111ee5, float:1.9289847E38)
            java.lang.String r4 = r4.getString(r5)
            r3.mo107595g(r4)
            mk1.h r4 = r2.f32569a
            com.tencent.mm.ui.MMFragmentActivity r4 = r4.f32534a
            r5 = 2131828452(0x7f111ee4, float:1.9289845E38)
            java.lang.String r4 = r4.getString(r5)
            r3.mo107602n(r4)
            mk1.i$a r4 = new mk1.i$a
            mk1.h r5 = r2.f32569a
            r4.<init>(r5)
            r3.mo107600l(r4)
            mk1.i$b r4 = new mk1.i$b
            a14.l<java.lang.Boolean> r5 = r2.f32570b
            r4.<init>(r5)
            r3.mo107593e(r4)
            r3.mo107603o()
            goto L_0x00b4
        L_0x00a7:
            a14.l<java.lang.Boolean> r3 = r2.f32570b
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r4)
            r3.resumeWith(r4)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mk1.C10922i.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
