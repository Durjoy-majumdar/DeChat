package p669qw;

import a14.C53916l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C67073a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Result;
import p232rw.C77572l;
import p232rw.C77574q;
import p232rw.C77575r;
import p431e.C116634a;
import z04.C112551y;

@C86522b
/* renamed from: qw.s */
public final class C77439s extends C86301e implements C77572l {

    /* renamed from: d */
    public final HashSet<String> f225864d = new HashSet<>();

    /* renamed from: qw.s$a */
    public static final class C77440a extends C116634a<RecordConfigProvider, C77575r> {

        /* renamed from: a */
        public final int f225865a;

        public C77440a(int i) {
            this.f225865a = i;
        }

        /* renamed from: a */
        public Intent mo105808a(Context context, Object obj) {
            RecordConfigProvider recordConfigProvider = (RecordConfigProvider) obj;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(recordConfigProvider, "input");
            Log.m105924i("MicroMsg.MediaOptService", "createIntent");
            int i = MMRecordUI.f272841o;
            Intent intent = new Intent(context, MMRecordUI.class);
            intent.putExtra("KEY_PARAMS_CONFIG", recordConfigProvider);
            intent.putExtra("KEY_PARAMS_EXIT_ANIM", C0966R.C0968anim.f2493eh);
            intent.putExtra("KEY_PARAMS_TO_WHERE", this.f225865a);
            return intent;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00c5  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo105809c(int r16, android.content.Intent r17) {
            /*
                r15 = this;
                r2 = r16
                r0 = r17
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "parseResult resultCode:"
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r5 = "MicroMsg.MediaOptService"
                com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r5, r1, r4)
                r1 = 0
                if (r0 == 0) goto L_0x0029
                java.lang.String r4 = "KSEGMENTMEDIAINFO"
                android.os.Parcelable r4 = r0.getParcelableExtra(r4)
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r4 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r4
                goto L_0x002a
            L_0x0029:
                r4 = r1
            L_0x002a:
                if (r0 == 0) goto L_0x0034
                java.lang.String r6 = "key_extra_data"
                android.os.Bundle r0 = r0.getBundleExtra(r6)
                r6 = r0
                goto L_0x0035
            L_0x0034:
                r6 = r1
            L_0x0035:
                if (r4 == 0) goto L_0x0040
                java.lang.Boolean r0 = r4.f272893d
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                boolean r0 = gy3.C87412m.m108589b(r0, r7)
                goto L_0x0041
            L_0x0040:
                r0 = 0
            L_0x0041:
                if (r0 == 0) goto L_0x0045
                r7 = 0
                goto L_0x0047
            L_0x0045:
                r0 = -3
                r7 = -3
            L_0x0047:
                if (r4 == 0) goto L_0x0052
                java.lang.Boolean r0 = r4.f272897h
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                boolean r0 = gy3.C87412m.m108589b(r0, r8)
                goto L_0x0053
            L_0x0052:
                r0 = 0
            L_0x0053:
                if (r0 == 0) goto L_0x0058
                rw.s r0 = p232rw.C77576s.Photo
                goto L_0x005a
            L_0x0058:
                rw.s r0 = p232rw.C77576s.Video
            L_0x005a:
                r9 = r0
                if (r4 == 0) goto L_0x0066
                java.lang.Boolean r0 = r4.f272897h
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                boolean r0 = gy3.C87412m.m108589b(r0, r8)
                goto L_0x0067
            L_0x0066:
                r0 = 0
            L_0x0067:
                if (r0 == 0) goto L_0x006c
                java.lang.String r0 = r4.f272895f
                goto L_0x0070
            L_0x006c:
                if (r4 == 0) goto L_0x0072
                java.lang.String r0 = r4.f272894e
            L_0x0070:
                r10 = r0
                goto L_0x0073
            L_0x0072:
                r10 = r1
            L_0x0073:
                if (r4 == 0) goto L_0x007d
                java.lang.Boolean r0 = r4.f272897h
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                boolean r3 = gy3.C87412m.m108589b(r0, r3)
            L_0x007d:
                if (r3 == 0) goto L_0x0082
                java.lang.String r0 = ""
                goto L_0x0086
            L_0x0082:
                if (r4 == 0) goto L_0x0088
                java.lang.String r0 = r4.f272895f
            L_0x0086:
                r11 = r0
                goto L_0x0089
            L_0x0088:
                r11 = r1
            L_0x0089:
                rw.q r14 = new rw.q
                if (r4 == 0) goto L_0x0090
                java.lang.Long r0 = r4.f272896g
                goto L_0x0091
            L_0x0090:
                r0 = r1
            L_0x0091:
                if (r0 != 0) goto L_0x0096
                r12 = -1
                goto L_0x009a
            L_0x0096:
                long r12 = r0.longValue()
            L_0x009a:
                r8 = r14
                r8.<init>(r9, r10, r11, r12)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "resultCode:"
                r0.append(r3)
                r0.append(r2)
                java.lang.String r3 = " model:"
                r0.append(r3)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                rw.r r8 = new rw.r
                r3 = -1
                if (r4 == 0) goto L_0x00c5
                com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r0 = r4.mo129798a()
                r9 = r0
                goto L_0x00c6
            L_0x00c5:
                r9 = r1
            L_0x00c6:
                r0 = r8
                r1 = r3
                r2 = r16
                r3 = r7
                r4 = r14
                r5 = r6
                r6 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p669qw.C77439s.C77440a.mo105809c(int, android.content.Intent):java.lang.Object");
        }
    }

    /* renamed from: qw.s$b */
    public static final class C77441b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53916l<C77575r> f225866d;

        public C77441b(C53916l<? super C77575r> lVar) {
            this.f225866d = lVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C53916l<C77575r> lVar = this.f225866d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(new C77575r(-1, -4, -1, (C77574q) null, (Bundle) null, (RecordMediaReportInfo) null)));
        }
    }

    /* renamed from: qw.s$c */
    public static final class C77442c<O> implements C67073a {

        /* renamed from: a */
        public final /* synthetic */ String f225867a;

        /* renamed from: b */
        public final /* synthetic */ C77439s f225868b;

        /* renamed from: c */
        public final /* synthetic */ C67073a<C77575r> f225869c;

        public C77442c(String str, C77439s sVar, C67073a<C77575r> aVar) {
            this.f225867a = str;
            this.f225868b = sVar;
            this.f225869c = aVar;
        }

        /* renamed from: a */
        public void mo91080a(Object obj) {
            Log.m105924i("MicroMsg.MediaOptService", "restoreCallback callback key:" + this.f225867a);
            this.f225868b.f225864d.remove(this.f225867a);
            this.f225869c.mo91080a((C77575r) obj);
        }
    }

    /* renamed from: FI */
    public boolean mo107611FI(ComponentActivity componentActivity, Bundle bundle, C67073a<C77575r> aVar) {
        C87412m.m108594g(componentActivity, "ui");
        C87412m.m108594g(aVar, "callback");
        if (bundle == null) {
            return false;
        }
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("android:support:activity-result") : null;
        if (bundle3 != null) {
            componentActivity.getActivityResultRegistry().mo164680c(bundle3);
            ArrayList<String> stringArrayList = bundle3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    C87412m.m108593f(str, "key");
                    if (C112551y.m153819s(str, "media_opt_", false) && this.f225864d.contains(str)) {
                        componentActivity.getActivityResultRegistry().mo164682e(str, new C77440a(-1), new C77442c(str, this, aVar));
                        Log.m105924i("MicroMsg.MediaOptService", "restoreCallback success key:" + str);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083  */
    /* renamed from: ZM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo107612ZM(androidx.activity.ComponentActivity r14, com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r15, wx3.C15601d<? super p232rw.C77575r> r16) {
        /*
            r13 = this;
            r6 = r14
            a14.m r7 = new a14.m
            wx3.d r0 = xx3.C66447b.m78392b(r16)
            r8 = 1
            r7.<init>(r0, r8)
            r7.mo74609p()
            qw.s$b r9 = new qw.s$b
            r9.<init>(r7)
            boolean r0 = p182kk.C61104a.m71652h(r14, r8, r9)
            java.lang.String r10 = "MicroMsg.MediaOptService"
            r11 = 0
            if (r0 != 0) goto L_0x005c
            boolean r0 = p182kk.C61104a.m71670z(r14, r9)
            if (r0 != 0) goto L_0x005c
            boolean r0 = p182kk.C61104a.m71666v(r14, r9)
            if (r0 == 0) goto L_0x0029
            goto L_0x005c
        L_0x0029:
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            r3 = 16
            java.lang.String r2 = "android.permission.CAMERA"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r1 = r14
            boolean r0 = r0.mo125788z1(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "not get enough permission checkCamera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r0 = 0
            r9.onClick(r0, r11)
            goto L_0x0061
        L_0x004a:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.tencent.mm.sdk.platformtools.MMStack r1 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r1 = r1.toString()
            r0[r11] = r1
            java.lang.String r1 = "checkPermission %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            goto L_0x0062
        L_0x005c:
            java.lang.String r0 = "checkPermission, voip or multitalk running"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x0061:
            r8 = 0
        L_0x0062:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "optRecord start ui:"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " checkPermission:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            if (r8 != 0) goto L_0x0083
            r0 = r13
            goto L_0x00f3
        L_0x0083:
            gy3.f0 r8 = new gy3.f0
            r8.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "media_opt_"
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r9 = r0.toString()
            qw.t r12 = new qw.t
            r0 = r12
            r1 = r14
            r2 = r9
            r3 = r8
            r4 = r13
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "optLaunch key:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r10, r0, r1)
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r0 != 0) goto L_0x00cd
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            if (r0 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r0 = r13
            goto L_0x00d3
        L_0x00cd:
            r0 = r13
            java.util.HashSet<java.lang.String> r1 = r0.f225864d
            r1.add(r9)
        L_0x00d3:
            androidx.activity.result.ActivityResultRegistry r1 = r14.getActivityResultRegistry()
            qw.s$a r2 = new qw.s$a
            r2.<init>(r11)
            androidx.activity.result.b r1 = r1.mo164682e(r9, r2, r12)
            r8.f27484d = r1
            s2.b r2 = p918s2.C118252b.m166809a()
            r3 = r15
            r1.mo91081a(r15, r2)
            r1 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r2 = 2130772172(0x7f0100cc, float:1.7147455E38)
            r14.overridePendingTransition(r1, r2)
        L_0x00f3:
            java.lang.Object r1 = r7.mo74608o()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p669qw.C77439s.mo107612ZM(androidx.activity.ComponentActivity, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, wx3.d):java.lang.Object");
    }
}
