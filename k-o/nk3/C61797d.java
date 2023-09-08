package nk3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44661m1;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.ResultKt;
import lv1.C99672i;
import ok3.C62072g;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: nk3.d */
public final class C61797d extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final Activity f175704d;

    /* renamed from: e */
    public final C44661m1 f175705e;

    /* renamed from: f */
    public ArrayList<C62072g> f175706f = new ArrayList<>();

    /* renamed from: g */
    public C32228q<? super View, ? super Integer, ? super C62072g, C13598b0> f175707g;

    /* renamed from: h */
    public C99672i f175708h;

    /* renamed from: i */
    public C0000n0 f175709i = C53930o0.m60555b();

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.adapter.FTSMultiAllResultAdapter$onBindViewHolder$1$1", mo125469f = "FTSMultiAllResultAdapter.kt", mo125470l = {90}, mo125471m = "invokeSuspend")
    /* renamed from: nk3.d$a */
    public static final class C61798a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f175710d;

        /* renamed from: e */
        public int f175711e;

        /* renamed from: f */
        public final /* synthetic */ RecyclerView.C16631z f175712f;

        /* renamed from: g */
        public final /* synthetic */ C62072g f175713g;

        @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.adapter.FTSMultiAllResultAdapter$onBindViewHolder$1$1$1", mo125469f = "FTSMultiAllResultAdapter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: nk3.d$a$a */
        public static final class C61799a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<Bitmap> f175714d;

            /* renamed from: e */
            public final /* synthetic */ C62072g f175715e;

            /* renamed from: f */
            public final /* synthetic */ RecyclerView.C16631z f175716f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61799a(C8479f0<Bitmap> f0Var, C62072g gVar, RecyclerView.C16631z zVar, C15601d<? super C61799a> dVar) {
                super(2, dVar);
                this.f175714d = f0Var;
                this.f175715e = gVar;
                this.f175716f = zVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C61799a(this.f175714d, this.f175715e, this.f175716f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C61799a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f175714d.f27484d = BitmapUtil.decodeFileWithSample(this.f175715e.f176473g, ((C61807l) this.f175716f).f175736E.getWidth(), ((C61807l) this.f175716f).f175736E.getHeight());
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61798a(RecyclerView.C16631z zVar, C62072g gVar, C15601d<? super C61798a> dVar) {
            super(2, dVar);
            this.f175712f = zVar;
            this.f175713g = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61798a(this.f175712f, this.f175713g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61798a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C8479f0 f0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f175711e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8479f0 f0Var2 = new C8479f0();
                C53896h0 h0Var = C53872d1.f151119c;
                C61799a aVar2 = new C61799a(f0Var2, this.f175713g, this.f175712f, (C15601d<? super C61799a>) null);
                this.f175710d = f0Var2;
                this.f175711e = 1;
                if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
                    return aVar;
                }
                f0Var = f0Var2;
            } else if (i == 1) {
                f0Var = (C8479f0) this.f175710d;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.FTSMultiAllResultAdapter", "decode failed " + this.f175713g.f176473g);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            T t = f0Var.f27484d;
            if (t != null) {
                C87412m.m108591d(t);
                if (!((Bitmap) t).isRecycled() && C87412m.m108589b(((C61807l) this.f175712f).f175736E.getTag(), this.f175713g.f176473g)) {
                    ((C61807l) this.f175712f).f175736E.setImageBitmap((Bitmap) f0Var.f27484d);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: nk3.d$b */
    public static final class C61800b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61797d f175717d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.C16631z f175718e;

        /* renamed from: f */
        public final /* synthetic */ int f175719f;

        public C61800b(C61797d dVar, RecyclerView.C16631z zVar, int i) {
            this.f175717d = dVar;
            this.f175718e = zVar;
            this.f175719f = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiAllResultAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32228q<? super View, ? super Integer, ? super C62072g, C13598b0> qVar = this.f175717d.f175707g;
            if (qVar != null) {
                View view2 = this.f175718e.f44854d;
                C87412m.m108593f(view2, "holder.itemView");
                Integer valueOf = Integer.valueOf(this.f175719f);
                C62072g gVar = this.f175717d.f175706f.get(this.f175719f);
                C87412m.m108593f(gVar, "dataList[position]");
                qVar.invoke(view2, valueOf, gVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiAllResultAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C61797d(Activity activity, C44661m1 m1Var) {
        C87412m.m108594g(activity, "context");
        this.f175704d = activity;
        this.f175705e = m1Var;
    }

    public int getItemCount() {
        Log.m105924i("MicroMsg.FTSMultiAllResultAdapter", "getItemCount >> " + this.f175706f.size());
        return this.f175706f.size();
    }

    public int getItemViewType(int i) {
        return this.f175706f.get(i).f176467a.f175694d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x033d, code lost:
        if (36 == r4) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0341, code lost:
        if (33 != r4) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0344, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0346, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0347, code lost:
        if (r1 == false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0349, code lost:
        r16 = nk3.C61796b.f175701n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x034d, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0363, code lost:
        if (((sk3.C63979f0) r14.mo62443b(r0.f175704d).mo75002a(r4)).mo88754m3(r8.getType()) != false) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x037b, code lost:
        if (((sk3.C63979f0) r14.mo62443b(r0.f175704d).mo75002a(r4)).mo88754m3(com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r9.f195604n1)) == false) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x037e, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0381, code lost:
        r14 = nk3.C61796b.f175700j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0384, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0386, code lost:
        r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs(r2, "");
        gy3.C87412m.m108593f(r1, "nullAs(msgContent, \"\")");
        r1 = ((p629ny.C76979h) di3.C86312j.m106911c(p629ny.C76979h.class)).Te0(r0.f175704d, z04.C112551y.m153814n(r1, "\n", " ", false), (float) com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162740d);
        gy3.C87412m.m108593f(r1, "getService(ISpannableSer…HINT_TEXT_SIZE.toFloat())");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03b0, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r6) != false) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03b2, code lost:
        r7 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e;
        r2 = ((float) com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a) - r7.measureText(r6.toString());
        r8 = r0.f175708h;
        gy3.C87412m.m108591d(r8);
        r1 = kv1.C99254i.m129308e(lv1.C99667f.m130090c(r1, r8, r2, r7)).f292107a;
        gy3.C87412m.m108593f(r1, "hl(FTSHLRequest.create(c…T_PAINT)).hlResultContent");
        r1 = android.text.TextUtils.concat(new java.lang.CharSequence[]{r6, r1});
        gy3.C87412m.m108593f(r1, "concat(tag, content)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03e5, code lost:
        r2 = r0.f175708h;
        gy3.C87412m.m108591d(r2);
        r1 = kv1.C99254i.m129308e(lv1.C99667f.m130090c(r1, r2, (float) com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a, com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e)).f292107a;
        gy3.C87412m.m108593f(r1, "hl(FTSHLRequest.create(c…T_PAINT)).hlResultContent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03fd, code lost:
        r2 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r0.f175704d, r12.f292152f, true);
        r6 = r12.f292153g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0408, code lost:
        if (r6 == null) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x040e, code lost:
        if (r6.length() != 0) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0411, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0414, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0416, code lost:
        if (r18 == false) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0418, code lost:
        r6 = r12.f292151e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x041b, code lost:
        r6 = r12.f292153g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x041d, code lost:
        r8 = ((f62.C75700k0) f40.C86709a0.m107533q(r11)).mo96097Ni().get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x042b, code lost:
        if (r8 != null) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x042d, code lost:
        r4 = ((p255vr.C65873e) di3.C86312j.m106911c(p255vr.C65873e.class)).Nf0(r6);
        gy3.C87412m.m108593f(r4, "{\n                Servic…ame(talker)\n            }");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0448, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r8.mo73969n2()) == false) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x044c, code lost:
        if (r0.f175705e == null) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x044e, code lost:
        r9 = r12.f292153g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0450, code lost:
        if (r9 == null) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0456, code lost:
        if (r9.length() != 0) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0459, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x045b, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x045c, code lost:
        if (r9 != false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x045e, code lost:
        r4 = r0.f175705e.mo69789q2(r12.f292153g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x046a, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r4) != false) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x046d, code lost:
        r4 = r8.mo62909j3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0472, code lost:
        r4 = r8.mo62909j3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0477, code lost:
        r4 = r8.mo73969n2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x047b, code lost:
        gy3.C87412m.m108593f(r4, "{\n                if (Ut…          }\n            }");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0481, code lost:
        r5.f176471e = r1;
        r5.f176470d = r4;
        r5.f176468b = r14;
        r5.f176474h = r6;
        r5.f176469c = r13;
        r5.f176472f = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01fc, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x022b, code lost:
        r9 = r2;
        r2 = r6;
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x029c, code lost:
        r23 = r9;
        r9 = r2;
        r2 = r6;
        r6 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02b8, code lost:
        r9 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02be, code lost:
        if (r9 == null) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02c0, code lost:
        r14 = bl3.C39818r.f106831a;
        r4 = r9.f195582i;
        ((sk3.C64034y) r14.mo62443b(r0.f175704d).mo75002a(sk3.C64034y.class)).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02d6, code lost:
        if (r4 != 6) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02d8, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02da, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02db, code lost:
        if (r1 == false) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02dd, code lost:
        r1 = nk3.C61796b.f175697g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02e0, code lost:
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02e2, code lost:
        r19 = r1;
        r4 = r9.f195582i;
        ((sk3.C63971c0) r14.mo62443b(r0.f175704d).mo75002a(sk3.C63971c0.class)).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02f8, code lost:
        if (r4 == 3) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02fc, code lost:
        if (r4 != 76) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02ff, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0301, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0302, code lost:
        if (r1 == false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0304, code lost:
        r1 = nk3.C61796b.f175699i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0307, code lost:
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0309, code lost:
        r16 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x031f, code lost:
        if (((sk3.C77723g0) r14.mo62443b(r0.f175704d).mo75002a(sk3.C77723g0.class)).mo107868j3(r9.f195582i) == false) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0321, code lost:
        r1 = nk3.C61796b.f175698h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0324, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0326, code lost:
        r16 = r1;
        r4 = r9.f195582i;
        ((sk3.C64028w) r14.mo62443b(r0.f175704d).mo75002a(sk3.C64028w.class)).getClass();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.Class<ln.f> r3 = p196ln.C76705f.class
            java.lang.Class<vr.h> r4 = p255vr.C78470h.class
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r1, r5)
            java.util.ArrayList<ok3.g> r5 = r0.f175706f
            java.lang.Object r5 = r5.get(r2)
            ok3.g r5 = (ok3.C62072g) r5
            nk3.a r5 = r5.f176467a
            int r5 = r5.f175694d
            r6 = 2
            if (r5 == r6) goto L_0x04ce
            java.util.ArrayList<ok3.g> r5 = r0.f175706f
            java.lang.Object r5 = r5.get(r2)
            ok3.g r5 = (ok3.C62072g) r5
            nk3.a r5 = r5.f176467a
            int r5 = r5.f175694d
            r8 = 3
            if (r5 != r8) goto L_0x002f
            goto L_0x04ce
        L_0x002f:
            java.util.ArrayList<ok3.g> r5 = r0.f175706f
            java.lang.Object r5 = r5.get(r2)
            ok3.g r5 = (ok3.C62072g) r5
            nk3.a r5 = r5.f176467a
            int r5 = r5.f175694d
            r9 = 1
            if (r5 != r9) goto L_0x04ca
            java.util.ArrayList<ok3.g> r5 = r0.f175706f
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r10 = "dataList[position]"
            gy3.C87412m.m108593f(r5, r10)
            ok3.g r5 = (ok3.C62072g) r5
            java.lang.Class<sk3.f0> r10 = sk3.C63979f0.class
            java.lang.Class<f62.k0> r11 = f62.C75700k0.class
            java.lang.String r12 = "MicroMsg.FTSMultiAllResultAdapter"
            java.lang.String r13 = "dealMatchInfoToResultBean"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            lv1.n r12 = r5.f176476j
            gy3.C87412m.m108591d(r12)
            java.lang.String r13 = r12.f292151e
            nk3.b r14 = nk3.C61796b.TEXT
            java.lang.Object r15 = r12.f292161o
            boolean r8 = r15 instanceof java.lang.Integer
            if (r8 == 0) goto L_0x0071
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r15, r8)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r8 = r15.intValue()
            goto L_0x0072
        L_0x0071:
            r8 = 0
        L_0x0072:
            if (r8 != r9) goto L_0x048e
            k40.a r8 = f40.C86709a0.m107533q(r11)
            f62.k0 r8 = (f62.C75700k0) r8
            g62.l r8 = r8.mo96095LE()
            r17 = r10
            long r9 = r12.f292150d
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            com.tencent.mm.storage.f4 r8 = r8.b00(r9)
            int r9 = r12.f292149c
            java.lang.String r10 = " "
            java.lang.String r15 = "\n"
            java.lang.String r6 = ": "
            java.lang.String r7 = ""
            switch(r9) {
                case 41: goto L_0x02a3;
                case 42: goto L_0x027b;
                case 43: goto L_0x0259;
                case 44: goto L_0x0230;
                case 45: goto L_0x01fe;
                case 46: goto L_0x01a8;
                case 47: goto L_0x01a8;
                case 48: goto L_0x0185;
                case 49: goto L_0x0162;
                case 50: goto L_0x0121;
                case 51: goto L_0x0095;
                case 52: goto L_0x0108;
                case 53: goto L_0x009c;
                default: goto L_0x0095;
            }
        L_0x0095:
            r22 = r4
            r21 = r14
            r2 = 0
            goto L_0x02bb
        L_0x009c:
            java.lang.String r6 = r8.getContent()
            r9 = 0
            com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r9)
            if (r6 == 0) goto L_0x00ef
            java.lang.Class<ht1.f> r9 = ht1.C60166f.class
            com.tencent.mm.message.g r9 = r6.mo93555w(r9)
            ht1.f r9 = (ht1.C60166f) r9
            java.lang.String r20 = r9.mo85179g()
            boolean r20 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
            if (r20 != 0) goto L_0x00ef
            r20 = r6
            android.app.Activity r6 = r0.f175704d
            r21 = r14
            r14 = 2
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r14 = r9.mo85179g()
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r7)
            r22 = r4
            r4 = 0
            r2[r4] = r14
            te3.rk1 r9 = r9.f171710b
            if (r9 == 0) goto L_0x00d6
            java.lang.String r9 = r9.f185187h
            goto L_0x00d7
        L_0x00d6:
            r9 = 0
        L_0x00d7:
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r7)
            java.lang.String r14 = "nullAs(appMsgContentFind…ct.shareObject?.desc, \"\")"
            gy3.C87412m.m108593f(r9, r14)
            java.lang.String r9 = z04.C112551y.m153814n(r9, r15, r10, r4)
            r4 = 1
            r2[r4] = r9
            r9 = 2131830492(0x7f1126dc, float:1.9293983E38)
            java.lang.String r2 = r6.getString(r9, r2)
            goto L_0x00f6
        L_0x00ef:
            r22 = r4
            r20 = r6
            r21 = r14
            r2 = r7
        L_0x00f6:
            android.app.Activity r6 = r0.f175704d
            r9 = 2131830501(0x7f1126e5, float:1.9294001E38)
            java.lang.String r6 = r6.getString(r9)
            java.lang.String r9 = "context.getString(com.te…_message_finder_feed_tag)"
            gy3.C87412m.m108593f(r6, r9)
            r19 = r20
            goto L_0x02b8
        L_0x0108:
            r22 = r4
            r21 = r14
            java.lang.String r2 = r8.getContent()
            r6 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r6)
            if (r2 == 0) goto L_0x01fc
            java.lang.String r6 = r2.mo93550m()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            goto L_0x022b
        L_0x0121:
            r22 = r4
            r21 = r14
            java.lang.String r2 = r8.getContent()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r13)
            if (r6 == 0) goto L_0x0133
            java.lang.String r2 = eb0.C75604z3.m90849u(r2)
        L_0x0133:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r6 != 0) goto L_0x0151
            k40.a r6 = f40.C86709a0.m107533q(r11)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4$e r6 = r6.Tx0(r2)
            boolean r9 = r6.mo101029a()
            if (r9 == 0) goto L_0x0151
            java.lang.String r2 = r6.f212708f
        L_0x0151:
            android.app.Activity r6 = r0.f175704d
            r9 = 2131830503(0x7f1126e7, float:1.9294005E38)
            java.lang.String r6 = r6.getString(r9)
            java.lang.String r9 = "context.getString(com.te…fts_message_location_tag)"
            gy3.C87412m.m108593f(r6, r9)
            r9 = 0
            goto L_0x02be
        L_0x0162:
            r22 = r4
            r21 = r14
            java.lang.String r2 = r8.getContent()
            r6 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r6)
            if (r2 == 0) goto L_0x0174
            java.lang.String r6 = r2.f195574g
            goto L_0x0175
        L_0x0174:
            r6 = r7
        L_0x0175:
            android.app.Activity r9 = r0.f175704d
            r14 = 2131830504(0x7f1126e8, float:1.9294007E38)
            java.lang.String r9 = r9.getString(r14)
            java.lang.String r14 = "context.getString(com.te…ing.fts_message_note_tag)"
            gy3.C87412m.m108593f(r9, r14)
            goto L_0x029c
        L_0x0185:
            r22 = r4
            r21 = r14
            java.lang.String r2 = r8.getContent()
            r6 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r6)
            if (r2 == 0) goto L_0x0197
            java.lang.String r6 = r2.f195570f
            goto L_0x0198
        L_0x0197:
            r6 = r7
        L_0x0198:
            android.app.Activity r9 = r0.f175704d
            r14 = 2131830499(0x7f1126e3, float:1.9293997E38)
            java.lang.String r9 = r9.getString(r14)
            java.lang.String r14 = "context.getString(com.te…fts_message_appbrand_tag)"
            gy3.C87412m.m108593f(r9, r14)
            goto L_0x029c
        L_0x01a8:
            r22 = r4
            r21 = r14
            java.lang.String r2 = r8.getContent()
            r9 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r9)
            if (r2 == 0) goto L_0x01fc
            int r9 = r8.mo108769t2()
            r4 = 1
            if (r9 != r4) goto L_0x01dd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = r2.f195596l1
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r7)
            r9.append(r14)
            r9.append(r6)
            java.lang.String r6 = r2.f195584i1
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x022b
        L_0x01dd:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = r2.f195596l1
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r7)
            r9.append(r14)
            r9.append(r6)
            java.lang.String r6 = r2.f195580h1
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x022b
        L_0x01fc:
            r6 = r7
            goto L_0x022b
        L_0x01fe:
            r22 = r4
            r21 = r14
            java.lang.String r2 = r8.getContent()
            r9 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r9)
            if (r2 == 0) goto L_0x02bb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = r2.f195570f
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r7)
            r9.append(r14)
            r9.append(r6)
            java.lang.String r6 = r2.f195574g
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x022b:
            r9 = r2
            r2 = r6
            r6 = r7
            goto L_0x02be
        L_0x0230:
            r22 = r4
            r21 = r14
            java.lang.String r2 = r8.getContent()
            r9 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r9)
            if (r2 == 0) goto L_0x02bb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = r2.f195570f
            r9.append(r14)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            java.lang.String r9 = r2.f195574g
            r23 = r9
            r9 = r2
            r2 = r23
            goto L_0x02be
        L_0x0259:
            r22 = r4
            r21 = r14
            java.lang.String r2 = r8.getContent()
            r6 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r6)
            if (r2 == 0) goto L_0x026b
            java.lang.String r6 = r2.f195570f
            goto L_0x026c
        L_0x026b:
            r6 = r7
        L_0x026c:
            android.app.Activity r9 = r0.f175704d
            r14 = 2131830502(0x7f1126e6, float:1.9294003E38)
            java.lang.String r9 = r9.getString(r14)
            java.lang.String r14 = "context.getString(com.te…ing.fts_message_link_tag)"
            gy3.C87412m.m108593f(r9, r14)
            goto L_0x029c
        L_0x027b:
            r22 = r4
            r21 = r14
            java.lang.String r2 = r8.getContent()
            r6 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r6)
            if (r2 == 0) goto L_0x028d
            java.lang.String r6 = r2.f195570f
            goto L_0x028e
        L_0x028d:
            r6 = r7
        L_0x028e:
            android.app.Activity r9 = r0.f175704d
            r14 = 2131830500(0x7f1126e4, float:1.9294E38)
            java.lang.String r9 = r9.getString(r14)
            java.lang.String r14 = "context.getString(com.te…ing.fts_message_file_tag)"
            gy3.C87412m.m108593f(r9, r14)
        L_0x029c:
            r23 = r9
            r9 = r2
            r2 = r6
            r6 = r23
            goto L_0x02be
        L_0x02a3:
            r22 = r4
            r21 = r14
            java.lang.String r2 = r8.getContent()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r13)
            if (r6 == 0) goto L_0x02b5
            java.lang.String r2 = eb0.C75604z3.m90849u(r2)
        L_0x02b5:
            r6 = r7
            r19 = 0
        L_0x02b8:
            r9 = r19
            goto L_0x02be
        L_0x02bb:
            r9 = r2
            r2 = r7
            r6 = r2
        L_0x02be:
            if (r9 == 0) goto L_0x0384
            bl3.r r14 = bl3.C39818r.f106831a
            android.app.Activity r4 = r0.f175704d
            bl3.r$a r4 = r14.mo62443b(r4)
            java.lang.Class<sk3.y> r1 = sk3.C64034y.class
            androidx.lifecycle.i0 r1 = r4.mo75002a(r1)
            sk3.y r1 = (sk3.C64034y) r1
            int r4 = r9.f195582i
            r1.getClass()
            r1 = 6
            if (r4 != r1) goto L_0x02da
            r1 = 1
            goto L_0x02db
        L_0x02da:
            r1 = 0
        L_0x02db:
            if (r1 == 0) goto L_0x02e0
            nk3.b r1 = nk3.C61796b.FILE
            goto L_0x02e2
        L_0x02e0:
            r1 = r21
        L_0x02e2:
            android.app.Activity r4 = r0.f175704d
            bl3.r$a r4 = r14.mo62443b(r4)
            r19 = r1
            java.lang.Class<sk3.c0> r1 = sk3.C63971c0.class
            androidx.lifecycle.i0 r1 = r4.mo75002a(r1)
            sk3.c0 r1 = (sk3.C63971c0) r1
            int r4 = r9.f195582i
            r1.getClass()
            r1 = 3
            if (r4 == r1) goto L_0x0301
            r1 = 76
            if (r4 != r1) goto L_0x02ff
            goto L_0x0301
        L_0x02ff:
            r1 = 0
            goto L_0x0302
        L_0x0301:
            r1 = 1
        L_0x0302:
            if (r1 == 0) goto L_0x0307
            nk3.b r1 = nk3.C61796b.MUSIC
            goto L_0x0309
        L_0x0307:
            r1 = r19
        L_0x0309:
            android.app.Activity r4 = r0.f175704d
            bl3.r$a r4 = r14.mo62443b(r4)
            r16 = r1
            java.lang.Class<sk3.g0> r1 = sk3.C77723g0.class
            androidx.lifecycle.i0 r1 = r4.mo75002a(r1)
            sk3.g0 r1 = (sk3.C77723g0) r1
            int r4 = r9.f195582i
            boolean r1 = r1.mo107868j3(r4)
            if (r1 == 0) goto L_0x0324
            nk3.b r1 = nk3.C61796b.URL
            goto L_0x0326
        L_0x0324:
            r1 = r16
        L_0x0326:
            android.app.Activity r4 = r0.f175704d
            bl3.r$a r4 = r14.mo62443b(r4)
            r16 = r1
            java.lang.Class<sk3.w> r1 = sk3.C64028w.class
            androidx.lifecycle.i0 r1 = r4.mo75002a(r1)
            sk3.w r1 = (sk3.C64028w) r1
            int r4 = r9.f195582i
            r1.getClass()
            r1 = 36
            if (r1 == r4) goto L_0x0346
            r1 = 33
            if (r1 != r4) goto L_0x0344
            goto L_0x0346
        L_0x0344:
            r1 = 0
            goto L_0x0347
        L_0x0346:
            r1 = 1
        L_0x0347:
            if (r1 == 0) goto L_0x034d
            nk3.b r1 = nk3.C61796b.APP_BRAND
            r16 = r1
        L_0x034d:
            android.app.Activity r1 = r0.f175704d
            bl3.r$a r1 = r14.mo62443b(r1)
            r4 = r17
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            sk3.f0 r1 = (sk3.C63979f0) r1
            int r8 = r8.getType()
            boolean r1 = r1.mo88754m3(r8)
            if (r1 != 0) goto L_0x0381
            android.app.Activity r1 = r0.f175704d
            bl3.r$a r1 = r14.mo62443b(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            sk3.f0 r1 = (sk3.C63979f0) r1
            java.lang.String r4 = r9.f195604n1
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)
            boolean r1 = r1.mo88754m3(r4)
            if (r1 == 0) goto L_0x037e
            goto L_0x0381
        L_0x037e:
            r14 = r16
            goto L_0x0386
        L_0x0381:
            nk3.b r14 = nk3.C61796b.PAY
            goto L_0x0386
        L_0x0384:
            r14 = r21
        L_0x0386:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r7)
            java.lang.String r2 = "nullAs(msgContent, \"\")"
            gy3.C87412m.m108593f(r1, r2)
            r2 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r15, r10, r2)
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.app.Activity r4 = r0.f175704d
            int r7 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162740d
            float r7 = (float) r7
            android.text.SpannableString r1 = r2.Te0(r4, r1, r7)
            java.lang.String r2 = "getService(ISpannableSer…HINT_TEXT_SIZE.toFloat())"
            gy3.C87412m.m108593f(r1, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r6)
            java.lang.String r4 = "hl(FTSHLRequest.create(c…T_PAINT)).hlResultContent"
            if (r2 != 0) goto L_0x03e5
            int r2 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            float r2 = (float) r2
            android.text.TextPaint r7 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
            java.lang.String r8 = r6.toString()
            float r8 = r7.measureText(r8)
            float r2 = r2 - r8
            lv1.i r8 = r0.f175708h
            gy3.C87412m.m108591d(r8)
            lv1.f r1 = lv1.C99667f.m130090c(r1, r8, r2, r7)
            lv1.g r1 = kv1.C99254i.m129308e(r1)
            java.lang.CharSequence r1 = r1.f292107a
            gy3.C87412m.m108593f(r1, r4)
            r2 = 2
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r7 = 0
            r2[r7] = r6
            r4 = 1
            r2[r4] = r1
            java.lang.CharSequence r1 = android.text.TextUtils.concat(r2)
            java.lang.String r2 = "concat(tag, content)"
            gy3.C87412m.m108593f(r1, r2)
            goto L_0x03fd
        L_0x03e5:
            r7 = 0
            lv1.i r2 = r0.f175708h
            gy3.C87412m.m108591d(r2)
            int r6 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            float r6 = (float) r6
            android.text.TextPaint r8 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
            lv1.f r1 = lv1.C99667f.m130090c(r1, r2, r6, r8)
            lv1.g r1 = kv1.C99254i.m129308e(r1)
            java.lang.CharSequence r1 = r1.f292107a
            gy3.C87412m.m108593f(r1, r4)
        L_0x03fd:
            android.app.Activity r2 = r0.f175704d
            long r8 = r12.f292152f
            r4 = 1
            java.lang.CharSequence r2 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r2, r8, r4)
            java.lang.String r6 = r12.f292153g
            if (r6 == 0) goto L_0x0414
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0411
            goto L_0x0414
        L_0x0411:
            r18 = 0
            goto L_0x0416
        L_0x0414:
            r18 = 1
        L_0x0416:
            if (r18 == 0) goto L_0x041b
            java.lang.String r6 = r12.f292151e
            goto L_0x041d
        L_0x041b:
            java.lang.String r6 = r12.f292153g
        L_0x041d:
            k40.a r8 = f40.C86709a0.m107533q(r11)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
            com.tencent.mm.storage.z1 r8 = r8.get(r6)
            if (r8 != 0) goto L_0x0440
            java.lang.Class<vr.e> r4 = p255vr.C65873e.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            vr.e r4 = (p255vr.C65873e) r4
            java.lang.String r4 = r4.Nf0(r6)
            java.lang.String r7 = "{\n                Servic…ame(talker)\n            }"
            gy3.C87412m.m108593f(r4, r7)
            goto L_0x0481
        L_0x0440:
            java.lang.String r9 = r8.mo73969n2()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0477
            com.tencent.mm.storage.m1 r9 = r0.f175705e
            if (r9 == 0) goto L_0x0472
            java.lang.String r9 = r12.f292153g
            if (r9 == 0) goto L_0x045b
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0459
            goto L_0x045b
        L_0x0459:
            r9 = 0
            goto L_0x045c
        L_0x045b:
            r9 = 1
        L_0x045c:
            if (r9 != 0) goto L_0x0472
            com.tencent.mm.storage.m1 r4 = r0.f175705e
            java.lang.String r7 = r12.f292153g
            java.lang.String r4 = r4.mo69789q2(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 != 0) goto L_0x046d
            goto L_0x047b
        L_0x046d:
            java.lang.String r4 = r8.mo62909j3()
            goto L_0x047b
        L_0x0472:
            java.lang.String r4 = r8.mo62909j3()
            goto L_0x047b
        L_0x0477:
            java.lang.String r4 = r8.mo73969n2()
        L_0x047b:
            java.lang.String r7 = "{\n                if (Ut…          }\n            }"
            gy3.C87412m.m108593f(r4, r7)
        L_0x0481:
            r5.f176471e = r1
            r5.f176470d = r4
            r5.f176468b = r14
            r5.f176474h = r6
            r5.f176469c = r13
            r5.f176472f = r2
            goto L_0x0490
        L_0x048e:
            r22 = r4
        L_0x0490:
            di3.d r1 = di3.C86312j.m106911c(r3)
            ln.f r1 = (p196ln.C76705f) r1
            r2 = r25
            r3 = r2
            nk3.m r3 = (nk3.C61808m) r3
            android.widget.ImageView r4 = r3.f175742z
            java.lang.String r6 = r5.f176474h
            r1.mo106849z(r4, r6)
            di3.d r1 = di3.C86312j.m106911c(r22)
            vr.h r1 = (p255vr.C78470h) r1
            java.lang.String r4 = r5.f176470d
            com.tencent.mm.ui.base.EllipsizeTextView r6 = r3.f175738A
            r1.mo108300VH(r4, r6)
            di3.d r1 = di3.C86312j.m106911c(r22)
            vr.h r1 = (p255vr.C78470h) r1
            java.lang.CharSequence r4 = r5.f176471e
            android.widget.TextView r6 = r3.f175739B
            r1.mo108300VH(r4, r6)
            di3.d r1 = di3.C86312j.m106911c(r22)
            vr.h r1 = (p255vr.C78470h) r1
            java.lang.CharSequence r4 = r5.f176472f
            android.widget.TextView r3 = r3.f175740C
            r1.mo108300VH(r4, r3)
            goto L_0x04cb
        L_0x04ca:
            r2 = r1
        L_0x04cb:
            r5 = r26
            goto L_0x0528
        L_0x04ce:
            r2 = r1
            r22 = r4
            r1 = r2
            nk3.l r1 = (nk3.C61807l) r1
            java.util.ArrayList<ok3.g> r4 = r0.f175706f
            r5 = r26
            java.lang.Object r4 = r4.get(r5)
            ok3.g r4 = (ok3.C62072g) r4
            android.widget.ImageView r6 = r1.f175736E
            java.lang.String r7 = r4.f176473g
            r6.setTag(r7)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ln.f r3 = (p196ln.C76705f) r3
            android.widget.ImageView r6 = r1.f175737z
            java.lang.String r7 = r4.f176474h
            r3.mo106849z(r6, r7)
            di3.d r3 = di3.C86312j.m106911c(r22)
            vr.h r3 = (p255vr.C78470h) r3
            java.lang.String r6 = r4.f176470d
            com.tencent.mm.ui.base.EllipsizeTextView r7 = r1.f175732A
            r3.mo108300VH(r6, r7)
            di3.d r3 = di3.C86312j.m106911c(r22)
            vr.h r3 = (p255vr.C78470h) r3
            java.lang.CharSequence r6 = r4.f176471e
            android.widget.TextView r7 = r1.f175733B
            r3.mo108300VH(r6, r7)
            di3.d r3 = di3.C86312j.m106911c(r22)
            vr.h r3 = (p255vr.C78470h) r3
            java.lang.CharSequence r6 = r4.f176472f
            android.widget.TextView r1 = r1.f175734C
            r3.mo108300VH(r6, r1)
            a14.n0 r7 = r0.f175709i
            r8 = 0
            r9 = 0
            nk3.d$a r10 = new nk3.d$a
            r1 = 0
            r10.<init>(r2, r4, r1)
            r11 = 3
            r12 = 0
            a14.C53895h.m60466d(r7, r8, r9, r10, r11, r12)
        L_0x0528:
            android.view.View r1 = r2.f44854d
            nk3.d$b r3 = new nk3.d$b
            r3.<init>(r0, r2, r5)
            r1.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk3.C61797d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        boolean z = true;
        if (!(i == 2 || i == 3)) {
            z = false;
        }
        if (z) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cvl, (ViewGroup) null);
            C87412m.m108593f(inflate, "from(parent.context).inf…lt_image_list_item, null)");
            return new C61807l(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cvm, (ViewGroup) null);
        C87412m.m108593f(inflate2, "from(parent.context).inf…t_normal_list_item, null)");
        return new C61808m(inflate2);
    }
}
