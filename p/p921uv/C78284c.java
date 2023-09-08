package p921uv;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import je0.C60794u;
import ob0.C11385n;
import p239sv.C13782a;
import p239sv.C77793t;
import xk0.C91263b;

/* renamed from: uv.c */
public abstract class C78284c implements C13782a {

    /* renamed from: a */
    public final Context f229309a;

    /* renamed from: b */
    public final int f229310b;

    /* renamed from: c */
    public final byte[] f229311c;

    /* renamed from: d */
    public final C77793t f229312d;

    /* renamed from: e */
    public WeakReference<C60794u> f229313e;

    /* renamed from: f */
    public WeakReference<C11385n> f229314f;

    /* renamed from: uv.c$a */
    public static final class C78285a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C60794u f229315d;

        /* renamed from: e */
        public final /* synthetic */ C78284c f229316e;

        public C78285a(C60794u uVar, C78284c cVar) {
            this.f229315d = uVar;
            this.f229316e = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x0185  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x018b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r7, int r8, java.lang.String r9, ob0.C117747y r10) {
            /*
                r6 = this;
                je0.u r0 = r6.f229315d
                boolean r10 = gy3.C87412m.m108589b(r10, r0)
                java.lang.String r0 = "MicroMsg.OpenIMJumpToProfile"
                if (r10 != 0) goto L_0x0010
                java.lang.String r7 = "not same not care response"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
                return
            L_0x0010:
                ob0.b0 r10 = f40.C86709a0.m107524d()
                je0.u r1 = r6.f229315d
                r1.getClass()
                r1 = 372(0x174, float:5.21E-43)
                r10.mo123470p(r1, r6)
                bp3.p r10 = bp3.C79758p.f233760a
                wf3.b r1 = new wf3.b
                r1.<init>()
                java.lang.Object r10 = r10.mo109880c(r1)
                r1 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                boolean r2 = gy3.C87412m.m108589b(r10, r2)
                r3 = 2
                r4 = 0
                if (r2 == 0) goto L_0x0038
                r8 = -1
                goto L_0x0052
            L_0x0038:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                boolean r2 = gy3.C87412m.m108589b(r10, r2)
                if (r2 == 0) goto L_0x0052
                je0.u r2 = r6.f229315d
                if (r2 == 0) goto L_0x0049
                te3.fy3 r2 = r2.f173158i
                goto L_0x004a
            L_0x0049:
                r2 = r4
            L_0x004a:
                if (r2 != 0) goto L_0x004d
                goto L_0x0052
            L_0x004d:
                java.lang.String r5 = "测试测试测试测试测试测试测试"
                r2.f183256f = r5
            L_0x0052:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "jumpToProfile() called with: errType = "
                r2.append(r5)
                r2.append(r7)
                java.lang.String r5 = ", errCode = "
                r2.append(r5)
                r2.append(r8)
                java.lang.String r5 = ", errMsg = "
                r2.append(r5)
                r2.append(r9)
                java.lang.String r5 = ", scene = "
                r2.append(r5)
                je0.u r5 = r6.f229315d
                r2.append(r5)
                java.lang.String r5 = " spamWording = "
                r2.append(r5)
                je0.u r5 = r6.f229315d
                if (r5 == 0) goto L_0x0089
                te3.fy3 r5 = r5.f173158i
                if (r5 == 0) goto L_0x0089
                java.lang.String r5 = r5.f183256f
                goto L_0x008a
            L_0x0089:
                r5 = r4
            L_0x008a:
                r2.append(r5)
                java.lang.String r5 = " searchOpenImRepairValue = "
                r2.append(r5)
                r2.append(r10)
                java.lang.String r10 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r10)
                r10 = 0
                if (r7 != 0) goto L_0x0146
                if (r8 != 0) goto L_0x0146
                je0.u r7 = r6.f229315d
                te3.fy3 r8 = r7.f173158i
                if (r8 == 0) goto L_0x0143
                te3.dy3 r7 = r7.f173156g
                java.lang.String r8 = r8.f183256f
                java.lang.String r9 = r7.f227190d
                if (r9 == 0) goto L_0x00b8
                boolean r9 = z04.C112551y.m153811k(r9)
                if (r9 == 0) goto L_0x00b6
                goto L_0x00b8
            L_0x00b6:
                r9 = 0
                goto L_0x00b9
            L_0x00b8:
                r9 = 1
            L_0x00b9:
                if (r9 != 0) goto L_0x0140
                android.content.Intent r9 = new android.content.Intent
                r9.<init>()
                java.lang.String r0 = r7.f227190d
                java.lang.String r2 = "Contact_User"
                r9.putExtra(r2, r0)
                java.lang.String r0 = r7.f227200q
                java.lang.String r2 = "AntispamTicket"
                r9.putExtra(r2, r0)
                java.lang.String r0 = r7.f227197n
                java.lang.String r2 = "key_add_contact_openim_appid"
                r9.putExtra(r2, r0)
                java.lang.String r0 = r7.f227201r
                java.lang.String r2 = "key_add_contact_openim_finder_username"
                r9.putExtra(r2, r0)
                java.lang.String r0 = r7.f227191e
                java.lang.String r2 = "Contact_Nick"
                r9.putExtra(r2, r0)
                java.lang.String r0 = r7.f227192f
                java.lang.String r2 = "Contact_PyInitial"
                r9.putExtra(r2, r0)
                java.lang.String r0 = r7.f227193g
                java.lang.String r2 = "Contact_QuanPin"
                r9.putExtra(r2, r0)
                int r0 = r7.f227194h
                java.lang.String r2 = "Contact_Sex"
                r9.putExtra(r2, r0)
                te3.b73 r0 = r7.f227199p
                int r0 = r0.f130995d
                java.lang.String r2 = "key_add_contact_custom_detail_visible"
                r9.putExtra(r2, r0)
                te3.b73 r7 = r7.f227199p
                java.lang.String r7 = r7.f130996e
                java.lang.String r0 = "key_add_contact_custom_detail"
                r9.putExtra(r0, r7)
                if (r8 == 0) goto L_0x0115
                boolean r7 = z04.C112551y.m153811k(r8)
                if (r7 == 0) goto L_0x0113
                goto L_0x0115
            L_0x0113:
                r7 = 0
                goto L_0x0116
            L_0x0115:
                r7 = 1
            L_0x0116:
                if (r7 == 0) goto L_0x011a
                r7 = 1
                goto L_0x011b
            L_0x011a:
                r7 = 3
            L_0x011b:
                uv.c r0 = r6.f229316e
                int r0 = r0.f229310b
                p921uv.C78282a.m94571a(r3, r7, r0)
                com.tencent.mm.feature.openim.impl.SpamInfo r7 = new com.tencent.mm.feature.openim.impl.SpamInfo
                uv.c r0 = r6.f229316e
                int r2 = r0.f229310b
                byte[] r0 = r0.f229311c
                r7.<init>(r2, r8, r0)
                java.lang.String r8 = "KSpamInfo"
                r9.putExtra(r8, r7)
                uv.c r7 = r6.f229316e
                android.content.Context r7 = r7.f229309a
                java.lang.String r8 = "profile"
                java.lang.String r0 = ".ui.ContactInfoUI"
                ke3.C88144b.m109791i(r7, r8, r0, r9, r4)
                r7 = r4
                r9 = r7
                goto L_0x0183
            L_0x0140:
                java.lang.String r7 = "openImSearchItem.UserName is null"
                goto L_0x0182
            L_0x0143:
                java.lang.String r7 = "rsp is null"
                goto L_0x0182
            L_0x0146:
                uv.c r0 = r6.f229316e
                int r0 = r0.f229310b
                p921uv.C78282a.m94571a(r3, r3, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "errType:"
                r0.append(r2)
                r0.append(r7)
                java.lang.String r2 = ", errCode:"
                r0.append(r2)
                r0.append(r8)
                java.lang.String r8 = ", errMsg:"
                r0.append(r8)
                r0.append(r9)
                java.lang.String r8 = r0.toString()
                r0 = 4
                if (r7 != r0) goto L_0x0181
                if (r9 == 0) goto L_0x017c
                boolean r7 = z04.C112551y.m153811k(r9)
                if (r7 == 0) goto L_0x017a
                goto L_0x017c
            L_0x017a:
                r7 = 0
                goto L_0x017d
            L_0x017c:
                r7 = 1
            L_0x017d:
                if (r7 != 0) goto L_0x0181
                r7 = r8
                goto L_0x0183
            L_0x0181:
                r7 = r8
            L_0x0182:
                r9 = r4
            L_0x0183:
                if (r7 != 0) goto L_0x018b
                uv.c r7 = r6.f229316e
                r7.mo108306b(r1, r4, r9)
                goto L_0x0190
            L_0x018b:
                uv.c r8 = r6.f229316e
                r8.mo108306b(r10, r7, r9)
            L_0x0190:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p921uv.C78284c.C78285a.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    public C78284c(Context context, int i, byte[] bArr, C77793t tVar) {
        C87412m.m108594g(context, "context");
        this.f229309a = context;
        this.f229310b = i;
        this.f229311c = bArr;
        this.f229312d = tVar;
    }

    /* renamed from: a */
    public abstract C60794u mo108305a();

    /* renamed from: b */
    public final void mo108306b(boolean z, String str, String str2) {
        Log.m105924i("MicroMsg.OpenIMJumpToProfile", "doCallback() called with: isSucceed = " + z + ", errMsg = " + str + ", errTips = " + str2);
        C77793t tVar = this.f229312d;
        if (tVar != null) {
            tVar.onResult(z, str, str2);
        }
    }

    /* renamed from: c */
    public final void mo108307c() {
        C60794u a = mo108305a();
        if (a != null) {
            C78285a aVar = new C78285a(a, this);
            C86709a0.m107524d().mo123455a(C91263b.CTRL_INDEX, aVar);
            C86709a0.m107524d().mo123460f(a);
            this.f229313e = new WeakReference<>(a);
            this.f229314f = new WeakReference<>(aVar);
        }
    }

    public void cancel() {
        C11385n nVar;
        C60794u uVar;
        Log.m105918d("MicroMsg.OpenIMJumpToProfile", "task cancel() called");
        WeakReference<C60794u> weakReference = this.f229313e;
        if (!(weakReference == null || (uVar = weakReference.get()) == null)) {
            C86709a0.m107524d().mo123458d(uVar);
        }
        WeakReference<C11385n> weakReference2 = this.f229314f;
        if (weakReference2 != null && (nVar = weakReference2.get()) != null) {
            C86709a0.m107524d().mo123470p(C91263b.CTRL_INDEX, nVar);
        }
    }
}
