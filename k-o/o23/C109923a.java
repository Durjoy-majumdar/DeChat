package o23;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import ai2.C103373k;
import ai2.C92007a;
import ai2.C92023q;
import ai2.C92025s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.sight.base.C85456b;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import eb0.C75592q0;
import f14.C58901s;
import f23.C97814a;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.ResultKt;
import l23.C109202j;
import lh2.C99417a;
import ob0.C11385n;
import ob0.C117747y;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import xb0.C102609h;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: o23.a */
public final class C109923a extends C99417a implements C109202j.C109205d, C109202j.C109204c, C11385n {

    /* renamed from: s */
    public static int f328900s;

    /* renamed from: f */
    public ViewGroup f328901f;

    /* renamed from: g */
    public long f328902g;

    /* renamed from: h */
    public int f328903h = -1;

    /* renamed from: i */
    public boolean f328904i;

    /* renamed from: j */
    public C103373k f328905j;

    /* renamed from: n */
    public final C13601g f328906n = C36568h.m40985a(new C109931g(this));

    /* renamed from: o */
    public final C13601g f328907o;

    /* renamed from: p */
    public final Runnable f328908p;

    /* renamed from: q */
    public final C109934d f328909q;

    /* renamed from: r */
    public final VideoTransPara f328910r;

    /* renamed from: o23.a$a */
    public static final class C109924a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109923a f328911d;

        public C109924a(C109923a aVar) {
            this.f328911d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/read/EditReadPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109923a aVar = this.f328911d;
            if (!aVar.f328904i) {
                aVar.mo161247x();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/read/EditReadPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: o23.a$b */
    public static final class C109925b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109923a f328912d;

        public C109925b(C109923a aVar) {
            this.f328912d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/read/EditReadPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109923a aVar = this.f328912d;
            aVar.f328903h = -1;
            aVar.f328904i = false;
            ((ViewGroup) ((C36570n) aVar.f328906n).getValue()).setVisibility(4);
            aVar.f328901f.setVisibility(8);
            C101198e.C62622a.m73576a(aVar.f291492d, C101198e.C101199b.EDIT_CANCEL_TTS, (Bundle) null, 2, (Object) null);
            C101198e.C62622a.m73576a(aVar.f291492d, C101198e.C101199b.EDIT_CLICK_VIEW, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/read/EditReadPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: o23.a$c */
    public static final class C109926c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109923a f328913d;

        public C109926c(C109923a aVar) {
            this.f328913d = aVar;
        }

        public final void run() {
            this.f328913d.mo161247x();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.plugin.read.EditReadPlugin$onSceneEnd$1", mo125469f = "EditReadPlugin.kt", mo125470l = {172}, mo125471m = "invokeSuspend")
    /* renamed from: o23.a$d */
    public static final class C109927d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f328914d;

        /* renamed from: e */
        public int f328915e;

        /* renamed from: f */
        public final /* synthetic */ C109923a f328916f;

        /* renamed from: g */
        public final /* synthetic */ String f328917g;

        /* renamed from: h */
        public final /* synthetic */ C117747y f328918h;

        /* renamed from: i */
        public final /* synthetic */ String f328919i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.plugin.read.EditReadPlugin$onSceneEnd$1$1", mo125469f = "EditReadPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: o23.a$d$a */
        public static final class C109928a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C8477a0 f328920d;

            /* renamed from: e */
            public final /* synthetic */ C109923a f328921e;

            /* renamed from: f */
            public final /* synthetic */ String f328922f;

            /* renamed from: g */
            public final /* synthetic */ String f328923g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C109928a(C8477a0 a0Var, C109923a aVar, String str, String str2, C15601d<? super C109928a> dVar) {
                super(2, dVar);
                this.f328920d = a0Var;
                this.f328921e = aVar;
                this.f328922f = str;
                this.f328923g = str2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C109928a(this.f328920d, this.f328921e, this.f328922f, this.f328923g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C109928a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:45:0x016a A[LOOP:0: B:17:0x00b3->B:45:0x016a, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x013a A[EDGE_INSN: B:64:0x013a->B:43:0x013a ?: BREAK  , SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r29) {
                /*
                    r28 = this;
                    r1 = r28
                    kotlin.ResultKt.throwOnFailure(r29)
                    gy3.a0 r2 = r1.f328920d
                    o23.a r0 = r1.f328921e
                    o23.d r3 = r0.f328909q
                    java.lang.String r5 = r1.f328922f
                    java.lang.String r12 = r1.f328923g
                    com.tencent.mm.modelcontrol.VideoTransPara r0 = r0.f328910r
                    int r0 = r0.f267175p
                    r3.getClass()
                    java.lang.String r3 = "channel-count"
                    java.lang.String r4 = "sample-rate"
                    java.lang.String r13 = "remux error:"
                    java.lang.String r14 = "MicroMsg.SimpleAudioRemuxer"
                    java.lang.String r6 = "src"
                    gy3.C87412m.m108594g(r5, r6)
                    java.lang.String r6 = "dest"
                    gy3.C87412m.m108594g(r12, r6)
                    android.media.MediaCodec$BufferInfo r15 = new android.media.MediaCodec$BufferInfo
                    r15.<init>()
                    android.media.MediaExtractor r10 = new android.media.MediaExtractor
                    r10.<init>()
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r12)
                    com.tencent.p014mm.vfs.C86013q1.m106444e(r12)
                    r16 = 1
                    r9 = 0
                    java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    r8.<init>()     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    r7.<init>(r8)     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    r10.setDataSource(r5)     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    r10.selectTrack(r9)     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    android.media.MediaFormat r6 = r10.getTrackFormat(r9)     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    java.lang.String r11 = "extractor.getTrackFormat(0)"
                    gy3.C87412m.m108593f(r6, r11)     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    java.lang.String r11 = "mime"
                    java.lang.String r11 = r6.getString(r11)     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    gy3.C87412m.m108591d(r11)     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    android.media.MediaCodec r11 = android.media.MediaCodec.createDecoderByType(r11)     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    java.lang.String r9 = "createDecoderByType(inpu…(MediaFormat.KEY_MIME)!!)"
                    gy3.C87412m.m108593f(r11, r9)     // Catch:{ IOException -> 0x019f, Exception -> 0x0184 }
                    r9 = 0
                    r18 = r8
                    r8 = 0
                    r11.configure(r6, r9, r9, r8)     // Catch:{ IOException -> 0x0180, Exception -> 0x017c }
                    r11.start()     // Catch:{ IOException -> 0x0180, Exception -> 0x017c }
                    boolean r9 = r6.containsKey(r4)     // Catch:{ IOException -> 0x0180, Exception -> 0x017c }
                    r17 = r11
                    r11 = 44100(0xac44, float:6.1797E-41)
                    if (r9 == 0) goto L_0x0081
                    int r4 = r6.getInteger(r4)     // Catch:{ IOException -> 0x0180, Exception -> 0x017c }
                    r9 = r4
                    goto L_0x0084
                L_0x0081:
                    r9 = 44100(0xac44, float:6.1797E-41)
                L_0x0084:
                    boolean r4 = r6.containsKey(r3)     // Catch:{ IOException -> 0x0180, Exception -> 0x017c }
                    if (r4 == 0) goto L_0x008f
                    int r3 = r6.getInteger(r3)     // Catch:{ IOException -> 0x0180, Exception -> 0x017c }
                    goto L_0x0090
                L_0x008f:
                    r3 = 1
                L_0x0090:
                    hh.h r6 = new hh.h     // Catch:{ IOException -> 0x0180, Exception -> 0x017c }
                    r19 = 44100(0xac44, float:6.1797E-41)
                    r4 = r6
                    r24 = r6
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r25 = r18
                    r3 = 2
                    r18 = 0
                    r8 = r3
                    r26 = r9
                    r9 = r19
                    r27 = r10
                    r10 = r0
                    r29 = r2
                    r1 = r17
                    r2 = 44100(0xac44, float:6.1797E-41)
                    r11 = r3
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x0179, Exception -> 0x0176 }
                L_0x00b3:
                    r3 = 1000(0x3e8, double:4.94E-321)
                    int r5 = r1.dequeueInputBuffer(r3)     // Catch:{ IOException -> 0x0179, Exception -> 0x0176 }
                    if (r5 < 0) goto L_0x00ee
                    java.nio.ByteBuffer r6 = r1.getInputBuffer(r5)     // Catch:{ IOException -> 0x0179, Exception -> 0x0176 }
                    gy3.C87412m.m108591d(r6)     // Catch:{ IOException -> 0x0179, Exception -> 0x0176 }
                    r7 = r27
                    r8 = 0
                    int r20 = r7.readSampleData(r6, r8)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    if (r20 >= 0) goto L_0x00db
                    r19 = 0
                    r20 = 0
                    r21 = 0
                    r23 = 4
                    r17 = r1
                    r18 = r5
                    r17.queueInputBuffer(r18, r19, r20, r21, r23)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    goto L_0x00f1
                L_0x00db:
                    r19 = 0
                    long r21 = r7.getSampleTime()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r23 = 0
                    r17 = r1
                    r18 = r5
                    r17.queueInputBuffer(r18, r19, r20, r21, r23)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r7.advance()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    goto L_0x00f1
                L_0x00ee:
                    r7 = r27
                    r8 = 0
                L_0x00f1:
                    int r3 = r1.dequeueOutputBuffer(r15, r3)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r4 = -3
                    if (r3 == r4) goto L_0x0132
                    r4 = -2
                    if (r3 == r4) goto L_0x011f
                    r4 = -1
                    if (r3 == r4) goto L_0x0132
                    java.nio.ByteBuffer r4 = r1.getOutputBuffer(r3)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    int r5 = r15.size     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    byte[] r6 = new byte[r5]     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    if (r4 == 0) goto L_0x010b
                    r4.get(r6, r8, r5)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                L_0x010b:
                    if (r4 == 0) goto L_0x0110
                    r4.clear()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                L_0x0110:
                    r1.releaseOutputBuffer(r3, r8)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r3 = r24
                    byte[] r4 = r3.mo32679a(r6)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r5 = r26
                    r5.write(r4)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    goto L_0x0136
                L_0x011f:
                    r3 = r24
                    r5 = r26
                    android.media.MediaFormat r4 = r1.getOutputFormat()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    java.lang.String r6 = "decoder.outputFormat"
                    gy3.C87412m.m108593f(r4, r6)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    java.lang.String r4 = "get output format"
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r4)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    goto L_0x0136
                L_0x0132:
                    r3 = r24
                    r5 = r26
                L_0x0136:
                    int r4 = r15.flags     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    if (r4 == 0) goto L_0x016a
                    byte[] r4 = r25.toByteArray()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r5 = 16
                    byte[] r0 = o23.C109933c.m149452a(r4, r0, r2, r5)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    int r2 = r0.length     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    com.tencent.p014mm.vfs.C86013q1.m106438T(r12, r0, r8, r2)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r1.stop()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r1.release()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r7.release()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r3.release()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r0.<init>()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    java.lang.String r1 = "remux success: "
                    r0.append(r1)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r0.append(r12)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)     // Catch:{ IOException -> 0x0174, Exception -> 0x0172 }
                    r8 = 1
                    goto L_0x01b9
                L_0x016a:
                    r24 = r3
                    r26 = r5
                    r27 = r7
                    goto L_0x00b3
                L_0x0172:
                    r0 = move-exception
                    goto L_0x0188
                L_0x0174:
                    r0 = move-exception
                    goto L_0x01a3
                L_0x0176:
                    r0 = move-exception
                L_0x0177:
                    r8 = 0
                    goto L_0x0188
                L_0x0179:
                    r0 = move-exception
                L_0x017a:
                    r8 = 0
                    goto L_0x01a3
                L_0x017c:
                    r0 = move-exception
                    r29 = r2
                    goto L_0x0188
                L_0x0180:
                    r0 = move-exception
                    r29 = r2
                    goto L_0x01a3
                L_0x0184:
                    r0 = move-exception
                    r29 = r2
                    goto L_0x0177
                L_0x0188:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r13)
                    java.lang.String r0 = r0.getMessage()
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                    goto L_0x01b9
                L_0x019f:
                    r0 = move-exception
                    r29 = r2
                    goto L_0x017a
                L_0x01a3:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r13)
                    java.lang.String r0 = r0.getMessage()
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                L_0x01b9:
                    r1 = r29
                    r1.f27482d = r8
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o23.C109923a.C109927d.C109928a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109927d(C109923a aVar, String str, C117747y yVar, String str2, C15601d<? super C109927d> dVar) {
            super(2, dVar);
            this.f328916f = aVar;
            this.f328917g = str;
            this.f328918h = yVar;
            this.f328919i = str2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C109927d(this.f328916f, this.f328917g, this.f328918h, this.f328919i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C109927d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C8477a0 a0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f328915e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8477a0 a0Var2 = new C8477a0();
                C53896h0 h0Var = C53872d1.f151119c;
                C109928a aVar2 = new C109928a(a0Var2, this.f328916f, this.f328919i, this.f328917g, (C15601d<? super C109928a>) null);
                this.f328914d = a0Var2;
                this.f328915e = 1;
                if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
                    return aVar;
                }
                a0Var = a0Var2;
            } else if (i == 1) {
                a0Var = (C8477a0) this.f328914d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (a0Var.f27482d) {
                C109923a aVar3 = this.f328916f;
                String str = this.f328917g;
                long j = ((C47326b) this.f328918h).f127011i;
                aVar3.getClass();
                C87412m.m108594g(str, "path");
                C103373k kVar = aVar3.f328905j;
                if (kVar != null) {
                    kVar.mo125981c(str, j);
                }
                long j2 = 0;
                C103373k kVar2 = aVar3.f328905j;
                C92007a aVar4 = kVar2 instanceof C92007a ? (C92007a) kVar2 : null;
                if (aVar4 != null) {
                    j2 = Math.min(aVar4.f263404c.mo146049c(), aVar3.f328902g);
                }
                aVar3.f328901f.setVisibility(8);
                C101198e.C62622a.m73576a(aVar3.f291492d, C101198e.C101199b.EDIT_CLICK_VIEW, (Bundle) null, 2, (Object) null);
                C101198e eVar = aVar3.f291492d;
                C101198e.C101199b bVar = C101198e.C101199b.EDIT_END_TTS;
                Bundle bundle = new Bundle();
                bundle.putLong("PARAM_1_LONG", j2);
                C13598b0 b0Var = C13598b0.f38549a;
                eVar.mo14585p(bVar, bundle);
                C97814a.f286944a.mo137151b(111);
            } else {
                Log.m105920e("MicroMsg.EditorReadPlugin", "tts remux error, input text:" + ((C47326b) this.f328918h).f127006d);
                this.f328916f.mo161248y();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: o23.a$e */
    public static final class C109929e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C109923a f328924d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109929e(C109923a aVar) {
            super(0);
            this.f328924d = aVar;
        }

        public Object invoke() {
            return (TextView) this.f328924d.f328901f.findViewById(C0966R.C0970id.kun);
        }
    }

    /* renamed from: o23.a$f */
    public static final class C109930f extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C109923a f328925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109930f(C109923a aVar) {
            super(0);
            this.f328925d = aVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f328925d.f328901f.findViewById(C0966R.C0970id.kuo);
        }
    }

    /* renamed from: o23.a$g */
    public static final class C109931g extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C109923a f328926d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109931g(C109923a aVar) {
            super(0);
            this.f328926d = aVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f328926d.f328901f.findViewById(C0966R.C0970id.kup);
        }
    }

    /* renamed from: o23.a$h */
    public static final class C109932h extends C87413o implements C32224a<MMProcessBar> {

        /* renamed from: d */
        public final /* synthetic */ C109923a f328927d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109932h(C109923a aVar) {
            super(0);
            this.f328927d = aVar;
        }

        public Object invoke() {
            return (MMProcessBar) this.f328927d.f328901f.findViewById(C0966R.C0970id.kuq);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109923a(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f328901f = viewGroup;
        C36568h.m40985a(new C109932h(this));
        C13601g a = C36568h.m40985a(new C109929e(this));
        this.f328907o = C36568h.m40985a(new C109930f(this));
        this.f328908p = new C109926c(this);
        LayoutInflater.from(this.f328901f.getContext()).inflate(C0966R.C0971layout.a0y, this.f328901f, true);
        this.f328901f.setOnClickListener(new C109924a(this));
        ((TextView) a.getValue()).setOnClickListener(new C109925b(this));
        C86709a0.m107529k().f251779b.mo123455a(5207, this);
        this.f328909q = new C109934d();
        this.f328910r = C102609h.Fx0().mo142238c6();
    }

    /* renamed from: c */
    public void mo138712c(long j) {
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
    }

    public void onFinish() {
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        if (yVar2 instanceof C47326b) {
            C47326b bVar = (C47326b) yVar2;
            if (bVar.f127009g == this.f328903h) {
                this.f328904i = false;
                ((ViewGroup) ((C36570n) this.f328906n).getValue()).setVisibility(4);
                if (i3 == 0 && i4 == 0) {
                    String str2 = C85456b.m105449b() + XVFSFile.SEPARATOR_CHAR + UUID.randomUUID();
                    String str3 = str2 + ".tts";
                    StringBuilder sb = new StringBuilder();
                    sb.append("tts success, input text:");
                    sb.append(bVar.f127006d);
                    sb.append(", speech size:");
                    byte[] bArr = bVar.f127010h;
                    sb.append(bArr != null ? Integer.valueOf(bArr.length) : null);
                    sb.append(", speech duration:");
                    sb.append(bVar.f127011i);
                    sb.append(", path:");
                    sb.append(str2);
                    Log.m105924i("MicroMsg.EditorReadPlugin", sb.toString());
                    C86013q1.m106437S(str2, bVar.f127010h);
                    C0001s1 s1Var = C0001s1.f0d;
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C109927d(this, str3, yVar, str2, (C15601d<? super C109927d>) null), 2, (Object) null);
                    return;
                }
                Log.m105920e("MicroMsg.EditorReadPlugin", "tts error, input text:" + bVar.f127006d + ", errType:" + i + ", errCode:" + i4);
                mo161248y();
            }
        }
    }

    public void release() {
        C86709a0.m107529k().f251779b.mo123470p(5207, this);
    }

    /* renamed from: s */
    public void mo159389s(C96552p0 p0Var, long j, boolean z) {
        this.f328902g = p0Var != null ? p0Var.getDurationMs() : 0;
    }

    /* renamed from: x */
    public final void mo161247x() {
        ((ViewGroup) ((C36570n) this.f328907o).getValue()).setVisibility(4);
        this.f328901f.getHandler().removeCallbacks(this.f328908p);
        this.f328901f.setVisibility(8);
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_CANCEL_TTS, (Bundle) null, 2, (Object) null);
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_CLICK_VIEW, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: y */
    public final void mo161248y() {
        ((ViewGroup) ((C36570n) this.f328906n).getValue()).setVisibility(4);
        ((ViewGroup) ((C36570n) this.f328907o).getValue()).setVisibility(0);
        this.f328901f.postDelayed(this.f328908p, 2000);
        C97814a.f286944a.mo137151b(112);
    }

    /* renamed from: z */
    public final void mo161249z(C92007a aVar) {
        C87412m.m108594g(aVar, "data");
        String valueOf = aVar instanceof C92025s ? String.valueOf(((C92025s) aVar).f263526g) : aVar instanceof C92023q ? ((C92023q) aVar).f263510i : "";
        this.f328905j = aVar instanceof C103373k ? (C103373k) aVar : null;
        this.f328904i = true;
        ((ViewGroup) ((C36570n) this.f328906n).getValue()).setVisibility(0);
        ((ViewGroup) ((C36570n) this.f328907o).getValue()).setVisibility(4);
        this.f328901f.setVisibility(0);
        String h = C75592q0.m90778h();
        C87412m.m108593f(h, "getDefaultFinderUsername()");
        C47326b bVar = new C47326b(h, valueOf);
        int i = f328900s;
        f328900s = i + 1;
        this.f328903h = i;
        bVar.f127009g = i;
        C86709a0.m107529k().f251779b.mo123460f(bVar);
        C97814a.f286944a.mo137151b(110);
    }
}
