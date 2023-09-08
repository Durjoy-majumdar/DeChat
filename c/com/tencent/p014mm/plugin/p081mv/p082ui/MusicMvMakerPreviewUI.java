package com.tencent.p014mm.plugin.p081mv.p082ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.C57067h;
import com.tencent.p014mm.sdk.platformtools.Log;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import k20.C9556a;
import kotlin.Metadata;
import m03.C109459m;
import m03.C61426c;
import nj3.C88989a;
import o40.C61926c;
import rx3.C13598b0;
import sb2.C101580p0;
import sb2.C63770h1;
import sb2.C63772i1;
import sb2.C63830o0;
import sb2.C63843r0;
import sx3.C110826x0;
import sx3.C48501y0;
import te3.C64621p23;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI */
public final class MusicMvMakerPreviewUI extends BaseMusicMvUI {

    /* renamed from: e */
    public C64621p23 f163022e;

    /* renamed from: f */
    public boolean f163023f;

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$a */
    public static final class C56899a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerPreviewUI f163024d;

        public C56899a(MusicMvMakerPreviewUI musicMvMakerPreviewUI) {
            this.f163024d = musicMvMakerPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f163024d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$b */
    public static final class C56900b implements C63770h1 {
        /* renamed from: a */
        public void mo80356a(Bitmap bitmap) {
            C87412m.m108594g(bitmap, "bitmap");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$c */
    public static final class C56901c implements C109459m {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMakerPreviewUI f163025a;

        /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$c$a */
        public static final class C56902a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ MusicMvMakerPreviewUI f163026d;

            /* renamed from: e */
            public final /* synthetic */ int f163027e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56902a(MusicMvMakerPreviewUI musicMvMakerPreviewUI, int i) {
                super(0);
                this.f163026d = musicMvMakerPreviewUI;
                this.f163027e = i;
            }

            public Object invoke() {
                ((C57067h) C39818r.f106831a.mo62444c(this.f163026d).mo75002a(C57067h.class)).mo80500d3(this.f163027e);
                return C13598b0.f38549a;
            }
        }

        public C56901c(MusicMvMakerPreviewUI musicMvMakerPreviewUI) {
            this.f163025a = musicMvMakerPreviewUI;
        }

        /* renamed from: a */
        public void mo80357a(int i, C58010a aVar) {
            C87412m.m108594g(aVar, "targetMedia");
            C61926c.m72668M(new C56902a(this.f163025a, i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$d */
    public /* synthetic */ class C56903d extends C24565l implements C32227p<Long, Long, C13598b0> {
        public C56903d(Object obj) {
            super(2, obj, C57067h.class, "onVideoProgressUpdate", "onVideoProgressUpdate(JJ)V", 0);
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            long longValue2 = ((Number) obj2).longValue();
            C57067h hVar = (C57067h) this.receiver;
            hVar.getClass();
            ((C119157j) C119157j.f356862d).mo183895z(new C63843r0(hVar, longValue, longValue2));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$e */
    public static final class C56904e implements C63772i1 {

        /* renamed from: d */
        public final /* synthetic */ C63830o0 f163028d;

        public C56904e(C63830o0 o0Var) {
            this.f163028d = o0Var;
        }

        public void select(int i) {
            C61426c cVar = this.f163028d.f180949n;
            if (cVar != null) {
                cVar.mo86384i(i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$f */
    public static final class C56905f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerPreviewUI f163029d;

        public C56905f(MusicMvMakerPreviewUI musicMvMakerPreviewUI) {
            this.f163029d = musicMvMakerPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(this.f163029d, MusicMvPostUI.class);
            C64621p23 p232 = this.f163029d.f163022e;
            if (p232 != null) {
                intent.putExtra("key_track_data", p232.toByteArray());
            }
            C61926c.m72680e(intent, this.f163029d.getIntent(), "key_mv_from_scene", 0, 4, (Object) null);
            MusicMvMakerPreviewUI musicMvMakerPreviewUI = this.f163029d;
            musicMvMakerPreviewUI.f163023f = true;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(musicMvMakerPreviewUI, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            musicMvMakerPreviewUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(musicMvMakerPreviewUI, "com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f163029d.finish();
            MvCreateActionStruct c = MvCreateReportHelper.f163005a.mo80352c();
            c.f156552k = 7;
            c.f156543G = 0;
            c.mo86054n();
            c.mo86056r();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bj8;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(C63830o0.class, C57067h.class, C101580p0.class));
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Class<sb2.p0> r1 = sb2.C101580p0.class
            super.onCreate(r21)
            r20.hideTitleView()
            r2 = 2131297513(0x7f0904e9, float:1.8212973E38)
            android.view.View r2 = r0.findViewById(r2)
            r3 = 200(0xc8, float:2.8E-43)
            com.tencent.p014mm.sdk.platformtools.Util.expandViewTouchArea(r2, r3, r3, r3, r3)
            com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$a r3 = new com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$a
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            android.view.Window r2 = r20.getWindow()
            android.view.View r2 = r2.getDecorView()
            java.lang.String r3 = "window.decorView"
            gy3.C87412m.m108593f(r2, r3)
            r3 = 1280(0x500, float:1.794E-42)
            r2.setSystemUiVisibility(r3)
            androidx.appcompat.app.AppCompatActivity r2 = r20.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r2 = r2.getColor(r3)
            r0.setActionbarColor(r2)
            r20.hideActionbarLine()
            te3.p23 r2 = new te3.p23
            r2.<init>()
            r0.f163022e = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r3 = "key_track_data"
            byte[] r2 = r2.getByteArrayExtra(r3)
            if (r2 == 0) goto L_0x0060
            te3.p23 r3 = r0.f163022e
            if (r3 == 0) goto L_0x0060
            r3.parseFrom(r2)
        L_0x0060:
            la2.n r2 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r2 = r2.mo138822a()
            r3 = 0
            r2.mo32203a(r3)
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r4 = r2.mo62444c(r0)
            java.lang.Class<sb2.o0> r5 = sb2.C63830o0.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            java.lang.String r5 = "UICProvider.of(this).get…PreviewBgUIC::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            sb2.o0 r4 = (sb2.C63830o0) r4
            te3.p23 r5 = r0.f163022e
            if (r5 == 0) goto L_0x0086
            java.lang.String r7 = r5.f184741f
            goto L_0x0087
        L_0x0086:
            r7 = 0
        L_0x0087:
            r4.f180943e = r7
            if (r5 == 0) goto L_0x00b3
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f184739d
            if (r5 == 0) goto L_0x00b3
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
            if (r5 == 0) goto L_0x00b3
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r5 = r5.media
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
            com.tencent.mm.protocal.protobuf.FinderMedia r5 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r5
            if (r5 == 0) goto L_0x00b3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r5.thumbUrl
            r7.append(r8)
            java.lang.String r5 = r5.thumb_url_token
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            goto L_0x00b4
        L_0x00b3:
            r5 = 0
        L_0x00b4:
            r4.f180944f = r5
            com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$b r5 = new com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$b
            r5.<init>()
            r4.mo88628e3(r5)
            te3.p23 r5 = r0.f163022e
            r4.f180945g = r5
            com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$c r5 = new com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$c
            r5.<init>(r0)
            r4.mo88629f3(r5)
            bl3.r$a r2 = r2.mo62444c(r0)
            java.lang.Class<com.tencent.mm.plugin.mv.ui.uic.h> r5 = com.tencent.p014mm.plugin.p081mv.p082ui.uic.C57067h.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r5)
            java.lang.String r5 = "UICProvider.of(this).get…viewTrackUIC::class.java)"
            gy3.C87412m.m108593f(r2, r5)
            com.tencent.mm.plugin.mv.ui.uic.h r2 = (com.tencent.p014mm.plugin.p081mv.p082ui.uic.C57067h) r2
            com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$d r5 = new com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$d
            r5.<init>(r2)
            r4.f180946h = r5
            com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$e r5 = new com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$e
            r5.<init>(r4)
            r2.f163415o = r5
            te3.p23 r4 = r0.f163022e
            r2.f163407d = r4
            if (r4 == 0) goto L_0x01a7
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.f184739d
            if (r4 == 0) goto L_0x01a7
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
            if (r4 == 0) goto L_0x01a7
            te3.hb1 r4 = r4.mvInfo
            if (r4 == 0) goto L_0x01a7
            java.util.LinkedList<te3.mb1> r4 = r4.f183455d
            if (r4 == 0) goto L_0x01a7
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
        L_0x0104:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01a7
            java.lang.Object r8 = r4.next()
            int r9 = r7 + 1
            if (r7 < 0) goto L_0x01a2
            te3.mb1 r8 = (te3.C64550mb1) r8
            long r10 = r8.f184260f
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0163
            te3.p23 r10 = r2.f163407d
            if (r10 == 0) goto L_0x0160
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r10 = r10.f184740e
            if (r10 == 0) goto L_0x0160
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
            r12 = 0
        L_0x012a:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x015d
            java.lang.Object r13 = r10.next()
            int r14 = r12 + 1
            if (r12 < 0) goto L_0x0158
            com.tencent.mm.protocal.protobuf.FinderObject r13 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r13
            long r5 = r13.f164794id
            r16 = r4
            long r3 = r8.f184260f
            int r17 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r17 != 0) goto L_0x0153
            com.tencent.mm.plugin.mv.ui.uic.h$a r3 = new com.tencent.mm.plugin.mv.ui.uic.h$a
            long r4 = (long) r12
            r6 = 0
            r3.<init>(r2, r4, r6)
            r3.f163418f = r8
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.uic.h$a> r4 = r2.f163408e
            r4.add(r3)
            r11 = 1
        L_0x0153:
            r12 = r14
            r4 = r16
            r3 = 0
            goto L_0x012a
        L_0x0158:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x015d:
            r16 = r4
            goto L_0x0189
        L_0x0160:
            r16 = r4
            goto L_0x0188
        L_0x0163:
            r16 = r4
            java.lang.String r3 = r8.f184261g
            if (r3 == 0) goto L_0x0172
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r3 = 0
            goto L_0x0173
        L_0x0172:
            r3 = 1
        L_0x0173:
            if (r3 != 0) goto L_0x0188
            com.tencent.mm.plugin.mv.ui.uic.h$a r3 = new com.tencent.mm.plugin.mv.ui.uic.h$a
            long r4 = (long) r7
            r6 = 0
            r3.<init>(r2, r4, r6)
            r3.f163418f = r8
            r4 = 1
            r3.f163419g = r4
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.uic.h$a> r4 = r2.f163408e
            r4.add(r3)
            r11 = 1
            goto L_0x0189
        L_0x0188:
            r11 = 0
        L_0x0189:
            if (r11 != 0) goto L_0x019c
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.uic.h$a> r3 = r2.f163408e
            com.tencent.mm.plugin.mv.ui.uic.h$a r4 = new com.tencent.mm.plugin.mv.ui.uic.h$a
            long r5 = (long) r7
            r7 = 0
            r4.<init>(r2, r5, r7)
            r4.f163418f = r8
            r5 = 1
            r4.f163419g = r5
            r3.add(r4)
        L_0x019c:
            r7 = r9
            r4 = r16
            r3 = 0
            goto L_0x0104
        L_0x01a2:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x01a7:
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.uic.h$a> r3 = r2.f163408e
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.mm.plugin.mv.ui.uic.h$a r3 = (com.tencent.p014mm.plugin.p081mv.p082ui.uic.C57067h.C57068a) r3
            if (r3 != 0) goto L_0x01b2
            goto L_0x01b5
        L_0x01b2:
            r4 = 1
            r3.f163420h = r4
        L_0x01b5:
            r3 = 0
            r2.f163411h = r3
            a14.s1 r4 = a14.C0001s1.f0d
            a14.h0 r5 = a14.C53872d1.f151119c
            r11 = 0
            sb2.q0 r7 = new sb2.q0
            r3 = 0
            r7.<init>(r2, r3)
            r8 = 2
            r9 = 0
            r6 = 0
            a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            androidx.appcompat.app.AppCompatActivity r4 = r2.getActivity()
            r5 = 2131299693(0x7f090d6d, float:1.8217395E38)
            android.view.View r4 = r4.findViewById(r5)
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r4
            r2.f163409f = r4
            android.view.View r7 = new android.view.View
            androidx.appcompat.app.AppCompatActivity r4 = r2.getActivity()
            r7.<init>(r4)
            androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            androidx.appcompat.app.AppCompatActivity r5 = r2.getActivity()
            r12 = 24
            int r5 = kg3.C76577a.m92151b(r5, r12)
            androidx.appcompat.app.AppCompatActivity r6 = r2.getActivity()
            r13 = 64
            int r6 = kg3.C76577a.m92151b(r6, r13)
            r4.<init>((int) r5, (int) r6)
            r7.setLayoutParams(r4)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r6 = r2.mo80499c3()
            r8 = -1
            r9 = 0
            r10 = 4
            jq3.C60898l.m71329W5(r6, r7, r8, r9, r10, r11)
            android.view.View r15 = new android.view.View
            androidx.appcompat.app.AppCompatActivity r4 = r2.getActivity()
            r15.<init>(r4)
            androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            androidx.appcompat.app.AppCompatActivity r5 = r2.getActivity()
            int r5 = kg3.C76577a.m92151b(r5, r12)
            androidx.appcompat.app.AppCompatActivity r6 = r2.getActivity()
            int r6 = kg3.C76577a.m92151b(r6, r13)
            r4.<init>((int) r5, (int) r6)
            r15.setLayoutParams(r4)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r14 = r2.mo80499c3()
            r16 = -2
            r17 = 0
            r18 = 4
            r19 = 0
            jq3.C60898l.m71327S5(r14, r15, r16, r17, r18, r19)
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = r2.f163409f
            if (r4 != 0) goto L_0x023c
            goto L_0x0249
        L_0x023c:
            rx3.g r5 = r2.f163414n
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            com.tencent.mm.plugin.mv.ui.view.SpeedyLinearLayoutManager r5 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.SpeedyLinearLayoutManager) r5
            r4.setLayoutManager(r5)
        L_0x0249:
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = r2.f163409f
            if (r4 != 0) goto L_0x024e
            goto L_0x0255
        L_0x024e:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r2 = r2.mo80499c3()
            r4.setAdapter(r2)
        L_0x0255:
            r2 = 2131300054(0x7f090ed6, float:1.8218127E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            if (r2 == 0) goto L_0x0268
            com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$f r4 = new com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI$f
            r4.<init>(r0)
            r2.setOnClickListener(r4)
        L_0x0268:
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r4 = r2.mo62444c(r0)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r1)
            sb2.p0 r4 = (sb2.C101580p0) r4
            te3.p23 r5 = r0.f163022e
            if (r5 == 0) goto L_0x0287
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f184739d
            if (r5 == 0) goto L_0x0287
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
            if (r5 == 0) goto L_0x0287
            te3.hb1 r5 = r5.mvInfo
            if (r5 == 0) goto L_0x0287
            te3.kb1 r6 = r5.f183456e
            goto L_0x0288
        L_0x0287:
            r6 = r3
        L_0x0288:
            r4.f297383e = r6
            bl3.r$a r2 = r2.mo62444c(r0)
            androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
            sb2.p0 r1 = (sb2.C101580p0) r1
            r1.mo141057c3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMakerPreviewUI.onCreate(android.os.Bundle):void");
    }

    public void onPause() {
        super.onPause();
        Log.printDebugStack("MicroMsg.GlobalMusicMvFloatBallUtil", "alvinluo Mv onPause hideAllFloatBall: %s, resumeFloatBall: %b", Boolean.FALSE, Boolean.valueOf(true & true));
    }

    public void onResume() {
        super.onResume();
        if (!this.f163023f) {
            this.f163023f = false;
        }
    }
}
