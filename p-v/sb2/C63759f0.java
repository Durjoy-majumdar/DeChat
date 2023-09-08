package sb2;

import a14.C0000n0;
import a14.C53973z1;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import android.app.ProgressDialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import bl3.C39818r;
import c14.C54637q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.model.flex.MusicMvFlexLiveList;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFlexEditUIC$buildItemConvertFactory$1;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import d14.C58057l;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59811e;
import hb2.C59822f;
import ib2.C60265a;
import ib2.C60268b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import p500dy.C97560f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C48991ce1;
import te3.C64621p23;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: sb2.f0 */
public final class C63759f0 extends UIComponent {

    /* renamed from: d */
    public final C54219z<Integer> f180768d;

    /* renamed from: e */
    public final LiveData<Integer> f180769e;

    /* renamed from: f */
    public final C54219z<Integer> f180770f;

    /* renamed from: g */
    public final LiveData<Integer> f180771g;

    /* renamed from: h */
    public final MusicMvFlexLiveList f180772h;

    /* renamed from: i */
    public final C103009m<C60265a> f180773i;

    /* renamed from: j */
    public final C13601g f180774j = C36568h.m40985a(new C63761b(this));

    /* renamed from: n */
    public final C13601g f180775n = C36568h.m40985a(new C63762c(this));

    /* renamed from: o */
    public C60268b.C60269a f180776o;

    /* renamed from: p */
    public final C63763d f180777p = new C63763d(this);

    /* renamed from: q */
    public ProgressDialog f180778q;

    /* renamed from: r */
    public C53973z1 f180779r;

    /* renamed from: s */
    public boolean f180780s;

    /* renamed from: sb2.f0$a */
    public static final class C63760a extends C53996a<C60265a> {
        /* renamed from: b */
        public C45252f<C39534d<C60265a>> mo70650e(LifecycleScope lifecycleScope, C53998c<C60265a> cVar) {
            C87412m.m108594g(lifecycleScope, "scope");
            C87412m.m108594g(cVar, "request");
            C54637q qVar = new C54637q();
            C39534d dVar = new C39534d(cVar);
            ArrayList<T> arrayList = dVar.f106151b;
            C60265a aVar = new C60265a("", 0, ((long) 2) * System.currentTimeMillis(), -1);
            aVar.f171819n = C0966R.C0969drawable.f357288aj0;
            arrayList.add(aVar);
            qVar.mo75539t(dVar);
            return new C58057l(qVar);
        }
    }

    /* renamed from: sb2.f0$b */
    public static final class C63761b extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C63759f0 f180781d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63761b(C63759f0 f0Var) {
            super(0);
            this.f180781d = f0Var;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f180781d.findViewById(C0966R.C0970id.ea5);
        }
    }

    /* renamed from: sb2.f0$c */
    public static final class C63762c extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ C63759f0 f180782d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63762c(C63759f0 f0Var) {
            super(0);
            this.f180782d = f0Var;
        }

        public Object invoke() {
            return new WxLinearLayoutManager(this.f180782d.getContext(), 0, false);
        }
    }

    /* renamed from: sb2.f0$d */
    public static final class C63763d implements C60268b.C60269a {

        /* renamed from: a */
        public final /* synthetic */ C63759f0 f180783a;

        public C63763d(C63759f0 f0Var) {
            this.f180783a = f0Var;
        }

        /* renamed from: a */
        public void mo80384a(int i, C60265a aVar) {
            C87412m.m108594g(aVar, "item");
            Log.m105924i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "OnDelBtnClicked, pos:" + i + ", type:" + aVar.f171813e);
            C60268b.C60269a aVar2 = this.f180783a.f180776o;
            if (aVar2 != null) {
                aVar2.mo80384a(i, aVar);
            }
            this.f180783a.f180772h.mo129612p(aVar);
            this.f180783a.f180772h.mo80353u();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFlexEditUIC$onActivityResult$1", mo125469f = "MusicMvMakerFlexEditUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sb2.f0$e */
    public static final class C63764e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63759f0 f180784d;

        /* renamed from: e */
        public final /* synthetic */ Intent f180785e;

        /* renamed from: f */
        public final /* synthetic */ int f180786f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63764e(C63759f0 f0Var, Intent intent, int i, C15601d<? super C63764e> dVar) {
            super(2, dVar);
            this.f180784d = f0Var;
            this.f180785e = intent;
            this.f180786f = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63764e(this.f180784d, this.f180785e, this.f180786f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63764e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C63759f0 f0Var = this.f180784d;
            Intent intent = this.f180785e;
            int i = this.f180786f;
            f0Var.getClass();
            if (i == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("KEY_RECORD_VIDEO_PATH");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = str;
                }
                String stringExtra2 = intent.getStringExtra("KEY_RECORD_VIDEO_THUMB_PATH");
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                boolean k = C86013q1.m106450k(stringExtra);
                boolean k2 = C86013q1.m106450k(str);
                Log.m105924i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "takePhotoFinished, videoPath:" + stringExtra + ", videoExist:" + k + ", thumbPath:" + str + ", thumbExist:" + k2);
                if (k) {
                    C94554a e302 = ((C97560f) C86312j.m106911c(C97560f.class)).e30(stringExtra, true);
                    C59811e eVar = new C59811e();
                    eVar.f170727g = 3;
                    eVar.f170730j = new C59811e.C59812a(str, stringExtra);
                    C59811e.C59821i iVar = r5;
                    C59811e.C59821i iVar2 = new C59811e.C59821i(stringExtra + '_' + stringExtra.hashCode(), stringExtra, (long) e302.f273443a, 0, 0, 24, (C8480h) null);
                    iVar.f170746d = e302.f273445c;
                    iVar.f170747e = e302.f273446d;
                    eVar.f170731n = iVar;
                    MvCreateReportHelper mvCreateReportHelper = MvCreateReportHelper.f163005a;
                    MvCreateReportHelper.f163007c = 1;
                    mvCreateReportHelper.mo80351b(f0Var.f180772h.f272353o.size(), eVar);
                    C60265a aVar = new C60265a("local_-1", 3, System.currentTimeMillis(), 0);
                    aVar.f171816h = new C60265a.C60266a(0, 0, (String) null, (GalleryItem$MediaItem) null, 0, 0, 63, (C8480h) null);
                    GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = new GalleryItem$VideoMediaItem();
                    galleryItem$VideoMediaItem.f162766w = e302.f273443a;
                    int i2 = e302.f273444b;
                    galleryItem$VideoMediaItem.f162768y = e302.f273445c;
                    galleryItem$VideoMediaItem.f162767x = e302.f273446d;
                    galleryItem$VideoMediaItem.f162769z = i2;
                    galleryItem$VideoMediaItem.f162747d = stringExtra;
                    galleryItem$VideoMediaItem.f162750g = str;
                    long currentTimeMillis = System.currentTimeMillis();
                    galleryItem$VideoMediaItem.f162752i = currentTimeMillis;
                    C60265a.C60266a aVar2 = aVar.f171816h;
                    if (aVar2 != null) {
                        aVar2.f171822c = str;
                    }
                    if (aVar2 != null) {
                        aVar2.f171820a = -1;
                    }
                    if (aVar2 != null) {
                        aVar2.f171821b = currentTimeMillis;
                    }
                    if (aVar2 != null) {
                        aVar2.f171823d = galleryItem$VideoMediaItem;
                    }
                    aVar.f171818j = galleryItem$VideoMediaItem.f162766w;
                    MvvmList.m119209l(f0Var.f180772h, aVar, false, 2, (Object) null);
                    f0Var.f180772h.mo80353u();
                    f0Var.f180770f.postValue(1);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sb2.f0$f */
    public static final class C63765f extends C87413o implements C32226l<List<? extends C60265a>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63844s f180787d;

        /* renamed from: e */
        public final /* synthetic */ C63759f0 f180788e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63765f(C63844s sVar, C63759f0 f0Var) {
            super(1);
            this.f180787d = sVar;
            this.f180788e = f0Var;
        }

        public Object invoke(Object obj) {
            boolean z;
            List list = (List) obj;
            C87412m.m108594g(list, "liveList");
            HashMap hashMap = new HashMap();
            LinkedList linkedList = new LinkedList();
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                C60265a aVar = (C60265a) it.next();
                hashMap.put(aVar.f171812d, aVar);
                C48991ce1 ce12 = new C48991ce1();
                ce12.f131674d = aVar.f171812d;
                ce12.f131675e = 0;
                ce12.f131676f = 0;
                linkedList.add(ce12);
            }
            C64621p23 value = this.f180787d.f180977g.getValue();
            if (value != null) {
                C63759f0 f0Var = this.f180788e;
                if (list.size() > 1) {
                    z = true;
                }
                f0Var.f180780s = z;
                C64621p23 c3 = C63759f0.m75020c3(f0Var, value, linkedList, hashMap);
                C59822f.f170752A.mo84778c(c3, C13640h0.f38647d);
                CommonKt.uiThread(new C63771i0(f0Var, c3));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63759f0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C54219z<Integer> zVar = new C54219z<>();
        this.f180768d = zVar;
        this.f180769e = zVar;
        C54219z<Integer> zVar2 = new C54219z<>();
        this.f180770f = zVar2;
        this.f180771g = zVar2;
        MusicMvFlexLiveList musicMvFlexLiveList = new MusicMvFlexLiveList(new C63760a(), new C53769h(), appCompatActivity);
        this.f180772h = musicMvFlexLiveList;
        this.f180773i = new C103009m<>(musicMvFlexLiveList, new MusicMvMakerFlexEditUIC$buildItemConvertFactory$1(this), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r5 = r0.objectDesc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0339  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final te3.C64621p23 m75020c3(sb2.C63759f0 r21, te3.C64621p23 r22, java.util.List r23, java.util.HashMap r24) {
        /*
            r21.getClass()
            te3.p23 r1 = new te3.p23
            r1.<init>()
            byte[] r0 = r22.toByteArray()
            java.lang.String r2 = "MicroMsg.Mv.MusicMvMakerFlexEditUIC"
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r1.parseFrom(r0)     // Catch:{ Exception -> 0x0015 }
            goto L_0x0021
        L_0x0015:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r5 = "mvFeedObj"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r4, r5, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0021:
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.f184739d
            if (r0 == 0) goto L_0x002c
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r0.objectDesc
            if (r5 == 0) goto L_0x002c
            te3.hb1 r5 = r5.mvInfo
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            r6 = 1
            if (r5 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r5.f183461j = r6
        L_0x0033:
            r7 = 0
            if (r0 == 0) goto L_0x005a
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x005a
            te3.hb1 r0 = r0.mvInfo
            if (r0 == 0) goto L_0x005a
            java.util.LinkedList<te3.mb1> r0 = r0.f183455d
            if (r0 == 0) goto L_0x005a
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x005a
            java.lang.Object r5 = r0.next()
            te3.mb1 r5 = (te3.C64550mb1) r5
            java.lang.String r9 = ""
            r5.f184261g = r9
            r5.f184260f = r7
            goto L_0x0047
        L_0x005a:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r0 = r1.f184740e
            r0.clear()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.f184739d
            if (r0 == 0) goto L_0x0072
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0072
            te3.hb1 r0 = r0.mvInfo
            if (r0 == 0) goto L_0x0072
            java.util.LinkedList<te3.mb1> r0 = r0.f183460i
            if (r0 == 0) goto L_0x0072
            r0.clear()
        L_0x0072:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r5 = r23.iterator()
            r10 = r7
            r9 = 0
        L_0x007d:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x0365
            java.lang.Object r12 = r5.next()
            int r13 = r9 + 1
            if (r9 < 0) goto L_0x0360
            te3.ce1 r12 = (te3.C48991ce1) r12
            java.lang.String r9 = r12.f131674d
            r14 = r24
            java.lang.Object r9 = r14.get(r9)
            ib2.a r9 = (ib2.C60265a) r9
            if (r9 == 0) goto L_0x0357
            te3.mb1 r15 = new te3.mb1
            r15.<init>()
            int r4 = r12.f131675e
            long r7 = (long) r4
            r15.f184262h = r7
            int r4 = r12.f131676f
            r15.f184259e = r4
            r15.f184258d = r10
            ib2.a$a r4 = r9.f171816h
            if (r4 == 0) goto L_0x00fb
            r15.f184271t = r6
            te3.nb1 r4 = new te3.nb1
            r4.<init>()
            ib2.a$a r7 = r9.f171816h
            if (r7 == 0) goto L_0x00bb
            java.lang.String r7 = r7.f171822c
            goto L_0x00bc
        L_0x00bb:
            r7 = 0
        L_0x00bc:
            r4.f184450d = r7
            int r7 = r12.f131675e
            long r7 = (long) r7
            r4.f184451e = r7
            r15.f184272u = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "local_material_id:"
            r4.append(r7)
            ib2.a$a r7 = r9.f171816h
            if (r7 == 0) goto L_0x00d7
            java.lang.String r7 = r7.f171822c
            goto L_0x00d8
        L_0x00d7:
            r7 = 0
        L_0x00d8:
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "local_material_time_offset_in_clip_ms:"
            r4.append(r7)
            int r7 = r12.f131675e
            long r7 = (long) r7
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x00fd
        L_0x00fb:
            r15.f184271t = r3
        L_0x00fd:
            int r4 = r12.f131676f
            long r7 = (long) r4
            long r10 = r10 + r7
            int r4 = r9.f171813e
            r7 = 3
            r8 = 2
            if (r4 == r6) goto L_0x013d
            if (r4 == r8) goto L_0x0110
            if (r4 == r7) goto L_0x013d
            r9 = r13
            r7 = 0
            goto L_0x007d
        L_0x0110:
            ib2.a$b r4 = r9.f171817i
            if (r4 == 0) goto L_0x0117
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r4.f171827b
            goto L_0x0118
        L_0x0117:
            r7 = 0
        L_0x0118:
            if (r4 == 0) goto L_0x0121
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r4.f171827b
            if (r8 == 0) goto L_0x0121
            long r8 = r8.f164794id
            goto L_0x0123
        L_0x0121:
            r8 = 0
        L_0x0123:
            if (r4 == 0) goto L_0x012c
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.f171827b
            if (r4 == 0) goto L_0x012c
            java.lang.String r4 = r4.objectNonceId
            goto L_0x012d
        L_0x012c:
            r4 = 0
        L_0x012d:
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            r15.f184269r = r12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r12.add(r6)
            goto L_0x0278
        L_0x013d:
            com.tencent.mm.protocal.protobuf.FinderObject r4 = new com.tencent.mm.protocal.protobuf.FinderObject
            r4.<init>()
            java.lang.String r6 = r9.f171812d
            com.tencent.mm.protocal.protobuf.FinderMedia r12 = new com.tencent.mm.protocal.protobuf.FinderMedia
            r12.<init>()
            ib2.a$a r7 = r9.f171816h
            if (r7 == 0) goto L_0x0150
            java.lang.String r3 = r7.f171822c
            goto L_0x0151
        L_0x0150:
            r3 = 0
        L_0x0151:
            r12.url = r3
            if (r7 == 0) goto L_0x0158
            int r3 = r7.f171824e
            goto L_0x0159
        L_0x0158:
            r3 = 0
        L_0x0159:
            float r3 = (float) r3
            r12.width = r3
            if (r7 == 0) goto L_0x0161
            int r3 = r7.f171825f
            goto L_0x0162
        L_0x0161:
            r3 = 0
        L_0x0162:
            float r3 = (float) r3
            r12.height = r3
            if (r7 == 0) goto L_0x0173
            r3 = r9
            long r8 = r7.f171821b
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x0175
        L_0x0173:
            r3 = r9
            r7 = 0
        L_0x0175:
            r12.decodeKey = r7
            int r7 = r3.f171818j
            r12.videoDuration = r7
            r4.objectNonceId = r6
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = new com.tencent.mm.protocal.protobuf.FinderObjectDesc
            r7.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r8 = r7.media
            r8.add(r12)
            r4.objectDesc = r7
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            r15.f184269r = r7
            ib2.a$a r3 = r3.f171816h
            if (r3 == 0) goto L_0x0197
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r7 = r3.f171823d
            goto L_0x0198
        L_0x0197:
            r7 = 0
        L_0x0198:
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r8 == 0) goto L_0x01a2
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r7 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r7
            int r7 = r7.f162763C
            r12.bitrate = r7
        L_0x01a2:
            if (r3 == 0) goto L_0x01b1
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = r3.f171823d
            if (r3 == 0) goto L_0x01b1
            int r3 = r3.getType()
            r7 = 2
            if (r3 != r7) goto L_0x01b1
            r3 = 1
            goto L_0x01b2
        L_0x01b1:
            r3 = 0
        L_0x01b2:
            r7 = 4
            if (r3 == 0) goto L_0x01b9
            r3 = 0
            r8 = 4
            goto L_0x024f
        L_0x01b9:
            float r3 = r12.width
            int r3 = (int) r3
            float r8 = r12.height
            int r8 = (int) r8
            float r3 = (float) r3
            r9 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r9
            float r8 = (float) r8
            float r3 = r3 / r8
            r8 = 6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12 = 5
            java.lang.Integer r18 = java.lang.Integer.valueOf(r12)
            r19 = 1061158912(0x3f400000, float:0.75)
            int r19 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            r12 = 2
            if (r19 >= 0) goto L_0x01e6
            java.lang.Integer[] r3 = new java.lang.Integer[r12]
            r16 = 0
            r3[r16] = r18
            r17 = 1
            r3[r17] = r9
            java.util.List r3 = sx3.C64197v.m75537f(r3)
            goto L_0x022b
        L_0x01e6:
            r16 = 0
            r17 = 1
            r20 = 1068149419(0x3faaaaab, float:1.3333334)
            int r3 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r3 > 0) goto L_0x0216
            java.lang.Integer[] r3 = new java.lang.Integer[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            r3[r16] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r3[r17] = r8
            r8 = 3
            java.lang.Integer r17 = java.lang.Integer.valueOf(r8)
            r3[r12] = r17
            java.lang.Integer r17 = java.lang.Integer.valueOf(r7)
            r3[r8] = r17
            r3[r7] = r18
            r7 = 5
            r3[r7] = r9
            java.util.List r3 = sx3.C64197v.m75537f(r3)
            goto L_0x022b
        L_0x0216:
            r8 = 3
            java.lang.Integer[] r3 = new java.lang.Integer[r12]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 0
            r3[r9] = r8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 1
            r3[r8] = r7
            java.util.List r3 = sx3.C64197v.m75537f(r3)
        L_0x022b:
            ky3.c$a r7 = ky3.C88334c.f255322d
            java.lang.String r8 = "random"
            gy3.C87412m.m108594g(r7, r8)
            boolean r8 = r3.isEmpty()
            if (r8 != 0) goto L_0x034f
            int r8 = r3.size()
            int r7 = r7.mo122718g(r8)
            java.lang.Object r3 = sx3.C110818d0.m150910H(r3, r7)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r15.f184270s = r3
            r3 = 1
            r8 = 2
        L_0x024f:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r4.objectDesc
            if (r7 != 0) goto L_0x0254
            goto L_0x0256
        L_0x0254:
            r7.mediaType = r8
        L_0x0256:
            if (r7 == 0) goto L_0x0263
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r7 = r7.media
            if (r7 == 0) goto L_0x0263
            java.lang.Object r7 = r7.getFirst()
            com.tencent.mm.protocal.protobuf.FinderMedia r7 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r7
            goto L_0x0264
        L_0x0263:
            r7 = 0
        L_0x0264:
            if (r7 != 0) goto L_0x0267
            goto L_0x0269
        L_0x0267:
            r7.mediaType = r8
        L_0x0269:
            java.util.LinkedList<java.lang.Integer> r7 = r15.f184269r
            if (r7 == 0) goto L_0x0274
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.add(r3)
        L_0x0274:
            r7 = r4
            r4 = r6
            r8 = 0
        L_0x0278:
            r15.f184260f = r8
            r15.f184261g = r4
            boolean r3 = r0.add(r4)
            if (r3 == 0) goto L_0x0306
            if (r7 == 0) goto L_0x0306
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r7.objectDesc
            if (r3 == 0) goto L_0x0293
            te3.hb1 r3 = r3.mvInfo
            if (r3 == 0) goto L_0x0293
            java.util.LinkedList<te3.mb1> r3 = r3.f183460i
            if (r3 == 0) goto L_0x0293
            r3.add(r15)
        L_0x0293:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r7.objectDesc
            if (r3 == 0) goto L_0x02a2
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r3 = r3.media
            if (r3 == 0) goto L_0x02a2
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.mm.protocal.protobuf.FinderMedia r3 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r3
            goto L_0x02a3
        L_0x02a2:
            r3 = 0
        L_0x02a3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "ref object media size:"
            r6.append(r12)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r12 = r7.objectDesc
            if (r12 == 0) goto L_0x02bf
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r12 = r12.media
            if (r12 == 0) goto L_0x02bf
            int r12 = r12.size()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x02c0
        L_0x02bf:
            r12 = 0
        L_0x02c0:
            r6.append(r12)
            java.lang.String r12 = ", "
            r6.append(r12)
            if (r3 == 0) goto L_0x02cd
            java.lang.String r12 = r3.url
            goto L_0x02ce
        L_0x02cd:
            r12 = 0
        L_0x02ce:
            r6.append(r12)
            java.lang.String r12 = ", ["
            r6.append(r12)
            if (r3 == 0) goto L_0x02df
            float r12 = r3.width
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            goto L_0x02e0
        L_0x02df:
            r12 = 0
        L_0x02e0:
            r6.append(r12)
            r12 = 32
            r6.append(r12)
            if (r3 == 0) goto L_0x02f1
            float r3 = r3.height
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x02f2
        L_0x02f1:
            r3 = 0
        L_0x02f2:
            r6.append(r3)
            r3 = 93
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r3 = r1.f184740e
            r3.add(r7)
        L_0x0306:
            r6 = 0
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0339
            if (r4 == 0) goto L_0x031c
            java.lang.String r3 = "local_"
            r8 = 0
            boolean r3 = z04.C112551y.m153819s(r4, r3, r8)
            r9 = 1
            if (r3 != r9) goto L_0x031e
            r16 = 1
            goto L_0x0320
        L_0x031c:
            r8 = 0
            r9 = 1
        L_0x031e:
            r16 = 0
        L_0x0320:
            if (r16 == 0) goto L_0x033b
            r15.f184264j = r9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = "createMvData isFirstUpload "
            r3.append(r12)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            goto L_0x033b
        L_0x0339:
            r8 = 0
            r9 = 1
        L_0x033b:
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r1.f184739d
            if (r3 == 0) goto L_0x035a
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            if (r3 == 0) goto L_0x035a
            te3.hb1 r3 = r3.mvInfo
            if (r3 == 0) goto L_0x035a
            java.util.LinkedList<te3.mb1> r3 = r3.f183460i
            if (r3 == 0) goto L_0x035a
            r3.add(r15)
            goto L_0x035a
        L_0x034f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection is empty."
            r0.<init>(r1)
            throw r0
        L_0x0357:
            r6 = r7
            r8 = 0
            r9 = 1
        L_0x035a:
            r7 = r6
            r9 = r13
            r3 = 0
            r6 = 1
            goto L_0x007d
        L_0x0360:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x0365:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63759f0.m75020c3(sb2.f0, te3.p23, java.util.List, java.util.HashMap):te3.p23");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0196, code lost:
        if (r10.f183797e == 2) goto L_0x019b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r29, int r30, android.content.Intent r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r31
            r3 = 1025(0x401, float:1.436E-42)
            r4 = 0
            if (r1 == r3) goto L_0x0218
            r3 = 10041(0x2739, float:1.407E-41)
            if (r1 == r3) goto L_0x0011
            goto L_0x0234
        L_0x0011:
            java.lang.String r1 = "MicroMsg.Mv.MusicMvMakerFlexEditUIC"
            java.lang.String r3 = "album preview callback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            r1 = 0
            if (r2 == 0) goto L_0x0022
            java.lang.String r3 = "PreviewItemObjCallbackAction"
            int r3 = r2.getIntExtra(r3, r1)
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            te3.lh3 r5 = new te3.lh3
            r5.<init>()
            if (r2 == 0) goto L_0x0035
            java.lang.String r6 = "PreviewItemObjCallback"
            byte[] r6 = r2.getByteArrayExtra(r6)
            if (r6 == 0) goto L_0x0035
            r5.parseFrom(r6)
        L_0x0035:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            long r7 = java.lang.System.currentTimeMillis()
            ib2.a r15 = new ib2.a
            r11 = 0
            r14 = 2
            long r9 = (long) r14
            long r12 = r7 * r9
            r16 = -1
            java.lang.String r10 = ""
            r9 = r15
            r14 = r16
            r9.<init>(r10, r11, r12, r14)
            r6.add(r15)
            java.util.LinkedList<te3.kz3> r5 = r5.f184107e
            java.lang.String r9 = "previewItemObj.selectItemList"
            gy3.C87412m.m108593f(r5, r9)
            java.util.Iterator r5 = r5.iterator()
            r9 = 0
        L_0x005f:
            boolean r10 = r5.hasNext()
            r11 = 1
            if (r10 == 0) goto L_0x01fa
            java.lang.Object r10 = r5.next()
            int r12 = r9 + 1
            if (r9 < 0) goto L_0x01f6
            te3.kz3 r10 = (te3.C64506kz3) r10
            te3.jh3 r13 = r10.f184006d
            r14 = 3
            if (r13 == 0) goto L_0x007b
            int r15 = r13.f183797e
            if (r15 != r14) goto L_0x007b
            r15 = 1
            goto L_0x007c
        L_0x007b:
            r15 = 0
        L_0x007c:
            java.lang.String r16 = ""
            if (r15 == 0) goto L_0x0104
            ib2.a r11 = new ib2.a
            if (r13 == 0) goto L_0x008c
            java.lang.String r13 = r13.f183796d
            if (r13 != 0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            r18 = r13
            goto L_0x008e
        L_0x008c:
            r18 = r16
        L_0x008e:
            r19 = 2
            long r1 = (long) r9
            long r20 = r7 + r1
            java.lang.String r1 = r10.f184007e
            if (r1 == 0) goto L_0x009e
            int r1 = java.lang.Integer.parseInt(r1)
            r22 = r1
            goto L_0x00a0
        L_0x009e:
            r22 = 0
        L_0x00a0:
            r17 = r11
            r17.<init>(r18, r19, r20, r22)
            te3.jh3 r1 = r10.f184006d
            if (r1 == 0) goto L_0x00fb
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f183798f
            if (r1 == 0) goto L_0x00fb
            ib2.a$b r2 = new ib2.a$b
            r2.<init>(r4, r4, r14, r4)
            r11.f171817i = r2
            r2.f171827b = r1
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r1.objectDesc
            if (r2 == 0) goto L_0x00cc
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r2 = r2.media
            if (r2 == 0) goto L_0x00cc
            r14 = 0
            java.lang.Object r2 = sx3.C110818d0.m150917O(r2, r14)
            com.tencent.mm.protocal.protobuf.FinderMedia r2 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r2
            if (r2 == 0) goto L_0x00cd
            int r2 = r2.videoDuration
            int r2 = r2 * 1000
            goto L_0x00ce
        L_0x00cc:
            r14 = 0
        L_0x00cd:
            r2 = 0
        L_0x00ce:
            r11.f171818j = r2
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x00fc
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r1 = r1.media
            if (r1 == 0) goto L_0x00fc
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r1 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r1
            if (r1 == 0) goto L_0x00fc
            ib2.a$b r2 = r11.f171817i
            if (r2 != 0) goto L_0x00e5
            goto L_0x00fc
        L_0x00e5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r1.thumbUrl
            r9.append(r10)
            java.lang.String r1 = r1.thumb_url_token
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            r2.f171826a = r1
            goto L_0x00fc
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            r6.add(r11)
            r2 = r31
            r13 = 2
            goto L_0x01f2
        L_0x0104:
            r14 = 0
            ib2.a r1 = new ib2.a
            if (r13 == 0) goto L_0x0111
            java.lang.String r2 = r13.f183796d
            if (r2 != 0) goto L_0x010e
            goto L_0x0111
        L_0x010e:
            r18 = r2
            goto L_0x0113
        L_0x0111:
            r18 = r16
        L_0x0113:
            r19 = 1
            long r14 = (long) r9
            long r20 = r7 + r14
            java.lang.String r2 = r10.f184007e
            if (r2 == 0) goto L_0x0123
            int r2 = java.lang.Integer.parseInt(r2)
            r22 = r2
            goto L_0x0125
        L_0x0123:
            r22 = 0
        L_0x0125:
            r17 = r1
            r17.<init>(r18, r19, r20, r22)
            te3.jh3 r2 = r10.f184006d
            if (r2 == 0) goto L_0x01ec
            pe3.b r2 = r2.f183799g
            if (r2 == 0) goto L_0x01ec
            byte[] r2 = r2.mo123703f()
            ib2.a$a r9 = new ib2.a$a
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 63
            r27 = 0
            r17 = r9
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27)
            r1.f171816h = r9
            te3.jh3 r10 = r10.f184006d
            if (r10 == 0) goto L_0x0159
            int r13 = r10.f183797e
            if (r13 != r11) goto L_0x0159
            r13 = 1
            goto L_0x015a
        L_0x0159:
            r13 = 0
        L_0x015a:
            java.lang.String r14 = "CREATOR"
            if (r13 == 0) goto L_0x0191
            android.os.Parcelable$Creator<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r10 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem.CREATOR
            gy3.C87412m.m108593f(r10, r14)
            java.lang.Object r2 = o40.C61926c.m72670O(r2, r10)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r2
            r9.f171823d = r2
            ib2.a$a r2 = r1.f171816h
            if (r2 == 0) goto L_0x0172
            java.lang.String r2 = r2.f171822c
            goto L_0x0173
        L_0x0172:
            r2 = r4
        L_0x0173:
            android.graphics.Point r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getPictureSize(r2)
            ib2.a$a r9 = r1.f171816h
            if (r9 != 0) goto L_0x017c
            goto L_0x0184
        L_0x017c:
            if (r2 == 0) goto L_0x0181
            int r10 = r2.x
            goto L_0x0182
        L_0x0181:
            r10 = 0
        L_0x0182:
            r9.f171824e = r10
        L_0x0184:
            if (r9 != 0) goto L_0x0188
        L_0x0186:
            r13 = 2
            goto L_0x01aa
        L_0x0188:
            if (r2 == 0) goto L_0x018d
            int r2 = r2.y
            goto L_0x018e
        L_0x018d:
            r2 = 0
        L_0x018e:
            r9.f171825f = r2
            goto L_0x0186
        L_0x0191:
            if (r10 == 0) goto L_0x0199
            int r10 = r10.f183797e
            r13 = 2
            if (r10 != r13) goto L_0x019a
            goto L_0x019b
        L_0x0199:
            r13 = 2
        L_0x019a:
            r11 = 0
        L_0x019b:
            if (r11 == 0) goto L_0x01aa
            android.os.Parcelable$Creator<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r10 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem.CREATOR
            gy3.C87412m.m108593f(r10, r14)
            java.lang.Object r2 = o40.C61926c.m72670O(r2, r10)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r2
            r9.f171823d = r2
        L_0x01aa:
            ib2.a$a r2 = r1.f171816h
            r9 = 0
            if (r2 != 0) goto L_0x01b1
            goto L_0x01bd
        L_0x01b1:
            if (r2 == 0) goto L_0x01ba
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r11 = r2.f171823d
            if (r11 == 0) goto L_0x01ba
            long r14 = r11.f162751h
            goto L_0x01bb
        L_0x01ba:
            r14 = r9
        L_0x01bb:
            r2.f171820a = r14
        L_0x01bd:
            if (r2 != 0) goto L_0x01c0
            goto L_0x01ce
        L_0x01c0:
            if (r2 == 0) goto L_0x01cb
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r11 = r2.f171823d
            if (r11 == 0) goto L_0x01cb
            java.lang.String r11 = r11.mo80159e()
            goto L_0x01cc
        L_0x01cb:
            r11 = r4
        L_0x01cc:
            r2.f171822c = r11
        L_0x01ce:
            ib2.a$a r2 = r1.f171816h
            if (r2 != 0) goto L_0x01d5
        L_0x01d2:
            r2 = r31
            goto L_0x01e0
        L_0x01d5:
            if (r2 == 0) goto L_0x01dd
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r11 = r2.f171823d
            if (r11 == 0) goto L_0x01dd
            long r9 = r11.f162752i
        L_0x01dd:
            r2.f171821b = r9
            goto L_0x01d2
        L_0x01e0:
            boolean r9 = r2 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r9 == 0) goto L_0x01ef
            r9 = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r9 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r9
            int r9 = r9.f162766w
            r1.f171818j = r9
            goto L_0x01ef
        L_0x01ec:
            r2 = r31
            r13 = 2
        L_0x01ef:
            r6.add(r1)
        L_0x01f2:
            r9 = r12
            r1 = 0
            goto L_0x005f
        L_0x01f6:
            sx3.C64197v.m75542k()
            throw r4
        L_0x01fa:
            r0.f180780s = r11
            com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r1 = r0.f180772h
            r1.mo129613q(r6)
            com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r1 = r0.f180772h
            r1.mo80353u()
            int r1 = r6.size()
            if (r1 <= 0) goto L_0x0234
            if (r3 != r11) goto L_0x0234
            androidx.lifecycle.z<java.lang.Integer> r1 = r0.f180768d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r1.postValue(r2)
            goto L_0x0234
        L_0x0218:
            la2.n r1 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r1 = r1.mo138822a()
            r1.resume()
            a14.s1 r5 = a14.C0001s1.f0d
            a14.h0 r6 = a14.C53872d1.f151119c
            r7 = 0
            sb2.f0$e r8 = new sb2.f0$e
            r1 = r30
            r8.<init>(r0, r2, r1, r4)
            r9 = 2
            r10 = 0
            a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
        L_0x0234:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63759f0.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean onBackPressed() {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63844s.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…MakerDataUIC::class.java)");
        C63844s sVar = (C63844s) a;
        Integer value = sVar.mo88633c3().getValue();
        if (value == null || value.intValue() != 1) {
            return false;
        }
        this.f180772h.mo129602c(new C63765f(sVar, this));
        return true;
    }
}
