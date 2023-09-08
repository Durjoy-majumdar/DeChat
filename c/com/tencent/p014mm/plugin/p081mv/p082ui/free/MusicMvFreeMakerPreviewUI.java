package com.tencent.p014mm.plugin.p081mv.p082ui.free;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.MenuItem;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.p082ui.BaseMusicMvUI;
import com.tencent.p014mm.plugin.p081mv.p082ui.widget.MvTracksEditView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Metadata;
import m03.C109459m;
import nj3.C76879j;
import nj3.C88989a;
import o40.C61926c;
import ob2.C61997e;
import ob2.C61998f;
import ob2.C61999g;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13598b0;
import sb2.C101580p0;
import sb2.C63770h1;
import sb2.C63830o0;
import sb2.C63845s0;
import sx3.C110826x0;
import sx3.C48501y0;
import te3.C64550mb1;
import te3.C64621p23;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFreeMakerPreviewUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI */
public final class MusicMvFreeMakerPreviewUI extends BaseMusicMvUI {

    /* renamed from: e */
    public C64621p23 f163116e = new C64621p23();

    /* renamed from: f */
    public boolean f163117f;

    /* renamed from: com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$a */
    public static final class C56951a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvFreeMakerPreviewUI f163118d;

        public C56951a(MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI) {
            this.f163118d = musicMvFreeMakerPreviewUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f163118d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$b */
    public static final class C56952b implements C63770h1 {
        /* renamed from: a */
        public void mo80356a(Bitmap bitmap) {
            C87412m.m108594g(bitmap, "bitmap");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$c */
    public static final class C56953c implements C109459m {
        /* renamed from: a */
        public void mo80357a(int i, C58010a aVar) {
            C87412m.m108594g(aVar, "targetMedia");
            Log.m105924i("MicroMsg.MusicMvFreeMakerPreviewUI", "media changed: Index=" + i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$d */
    public /* synthetic */ class C56954d extends C24565l implements C32226l<Long, C13598b0> {
        public C56954d(Object obj) {
            super(1, obj, C61999g.class, "onVideoProgressUpdate", "onVideoProgressUpdate(J)V", 0);
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            MvTracksEditView mvTracksEditView = ((C61999g) this.receiver).f176250d;
            if (mvTracksEditView != null) {
                mvTracksEditView.setVideoProgress(longValue);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("tracksEditView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$e */
    public static final class C56955e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvFreeMakerPreviewUI f163119d;

        /* renamed from: com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$e$a */
        public static final class C56956a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ MusicMvFreeMakerPreviewUI f163120d;

            /* renamed from: e */
            public final /* synthetic */ C89779i0 f163121e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56956a(MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI, C89779i0 i0Var) {
                super(0);
                this.f163120d = musicMvFreeMakerPreviewUI;
                this.f163121e = i0Var;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
                r1 = (r1 = r1.objectDesc).mvInfo;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r15 = this;
                    com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI r0 = r15.f163120d
                    te3.p23 r1 = r0.f163116e
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f184739d
                    r2 = 0
                    if (r1 == 0) goto L_0x0014
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                    if (r1 == 0) goto L_0x0014
                    te3.hb1 r1 = r1.mvInfo
                    if (r1 == 0) goto L_0x0014
                    java.util.LinkedList<te3.mb1> r1 = r1.f183460i
                    goto L_0x0015
                L_0x0014:
                    r1 = r2
                L_0x0015:
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L_0x00b3
                    boolean r5 = r1.isEmpty()
                    if (r5 == 0) goto L_0x0021
                    goto L_0x00b3
                L_0x0021:
                    java.util.Iterator r5 = r1.iterator()
                L_0x0025:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto L_0x0095
                    java.lang.Object r6 = r5.next()
                    te3.mb1 r6 = (te3.C64550mb1) r6
                    te3.p23 r7 = r0.f163116e
                    java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r7.f184740e
                    java.lang.String r8 = "trackData.refObjectList"
                    gy3.C87412m.m108593f(r7, r8)
                    java.util.Iterator r7 = r7.iterator()
                L_0x003f:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L_0x0069
                    java.lang.Object r8 = r7.next()
                    r9 = r8
                    com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r9
                    long r10 = r6.f184260f
                    r12 = 0
                    int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r14 == 0) goto L_0x005e
                    long r12 = r9.f164794id
                    int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r9 != 0) goto L_0x005c
                    r9 = 1
                    goto L_0x0066
                L_0x005c:
                    r9 = 0
                    goto L_0x0066
                L_0x005e:
                    java.lang.String r10 = r6.f184261g
                    java.lang.String r9 = r9.objectNonceId
                    boolean r9 = gy3.C87412m.m108589b(r10, r9)
                L_0x0066:
                    if (r9 == 0) goto L_0x003f
                    goto L_0x006a
                L_0x0069:
                    r8 = r2
                L_0x006a:
                    com.tencent.mm.protocal.protobuf.FinderObject r8 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r8
                    if (r8 == 0) goto L_0x0081
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r8.objectDesc
                    if (r7 == 0) goto L_0x0081
                    te3.hb1 r7 = r7.mvInfo
                    if (r7 == 0) goto L_0x0081
                    java.util.LinkedList<te3.mb1> r7 = r7.f183460i
                    if (r7 == 0) goto L_0x0081
                    java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
                    te3.mb1 r7 = (te3.C64550mb1) r7
                    goto L_0x0082
                L_0x0081:
                    r7 = r2
                L_0x0082:
                    if (r7 == 0) goto L_0x0025
                    long r8 = r6.f184258d
                    r7.f184258d = r8
                    int r8 = r6.f184259e
                    r7.f184259e = r8
                    long r8 = r6.f184262h
                    r7.f184262h = r8
                    java.lang.String r6 = r6.f184268q
                    r7.f184268q = r6
                    goto L_0x0025
                L_0x0095:
                    java.util.Iterator r0 = r1.iterator()
                    java.lang.String r1 = "trackList.iterator()"
                    gy3.C87412m.m108593f(r0, r1)
                L_0x009f:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L_0x00cd
                    java.lang.Object r1 = r0.next()
                    te3.mb1 r1 = (te3.C64550mb1) r1
                    int r1 = r1.f184259e
                    if (r1 > 0) goto L_0x009f
                    r0.remove()
                    goto L_0x009f
                L_0x00b3:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r5 = "null or empty track list: "
                    r2.append(r5)
                    r2.append(r1)
                    java.lang.String r1 = r2.toString()
                    java.lang.String r2 = "MicroMsg.MusicMvFreeMakerPreviewUI"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
                    r0.finish()
                L_0x00cd:
                    com.tencent.mm.plugin.mv.ui.free.b r0 = new com.tencent.mm.plugin.mv.ui.free.b
                    qo3.i0 r1 = r15.f163121e
                    com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI r2 = r15.f163120d
                    r0.<init>(r1, r2)
                    com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI r1 = r15.f163120d
                    te3.p23 r1 = r1.f163116e
                    java.lang.String r1 = r1.f184741f
                    if (r1 == 0) goto L_0x00e4
                    int r1 = r1.length()
                    if (r1 != 0) goto L_0x00e5
                L_0x00e4:
                    r3 = 1
                L_0x00e5:
                    if (r3 == 0) goto L_0x00f1
                    hb2.f$a r1 = hb2.C59822f.f170752A
                    com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI r2 = r15.f163120d
                    te3.p23 r2 = r2.f163116e
                    r1.mo84778c(r2, r0)
                    goto L_0x00f6
                L_0x00f1:
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.invoke(r1)
                L_0x00f6:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.free.MusicMvFreeMakerPreviewUI.C56955e.C56956a.invoke():java.lang.Object");
            }
        }

        public C56955e(MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI) {
            this.f163119d = musicMvFreeMakerPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/free/MusicMvFreeMakerPreviewUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C61926c.m72656A((String) null, new C56956a(this.f163119d, C76879j.m92723Q(this.f163119d.getContext(), "", this.f163119d.getContext().getString(C0966R.string.gas), true, false, (DialogInterface.OnCancelListener) null)));
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFreeMakerPreviewUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359905bj0;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(C63830o0.class, C61999g.class, C101580p0.class, C63845s0.class));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 7 && i2 == -1) {
            finish();
        }
    }

    public void onBackPressed() {
        boolean z;
        C61999g gVar = (C61999g) C39818r.f106831a.mo62444c(this).mo75002a(C61999g.class);
        if (gVar.f176256j || gVar.f176257n || gVar.f176259p) {
            z = true;
        } else {
            LinkedList<C64550mb1> linkedList = gVar.f176254h;
            if (linkedList != null) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C64550mb1) it.next()).f184268q != null) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            } else {
                C87412m.m108603p("trackList");
                throw null;
            }
        }
        if (z) {
            C77407n nVar = new C77407n((Context) gVar.getActivity(), 1, true);
            nVar.mo107570o(true);
            nVar.mo107568m(gVar.getResources().getString(C0966R.string.h4s), 17, gVar.getResources().getDimensionPixelSize(C0966R.dimen.f3964lm));
            nVar.mo107566k(gVar.getContext().getResources().getColor(C0966R.color.f2953a_));
            nVar.f225771i = new C61997e(gVar);
            nVar.f225782p = new C61998f(gVar, nVar);
            nVar.mo107573q();
            return;
        }
        gVar.getActivity().finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0074, code lost:
        r2 = (r2 = r2.objectDesc).mvInfo;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x010f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<sb2.o0> r1 = sb2.C63830o0.class
            super.onCreate(r19)
            r2 = 2131833321(0x7f1131e9, float:1.929972E38)
            r0.setMMTitle((int) r2)
            r2 = 2131755954(0x7f1003b2, float:1.9142802E38)
            r3 = -1
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r2, r3)
            r0.updateBackBtn(r2)
            android.content.Intent r2 = r18.getIntent()
            java.lang.String r4 = "key_mv_from_scene"
            r5 = 0
            int r2 = r2.getIntExtra(r4, r5)
            r4 = 2
            if (r4 != r2) goto L_0x0030
            r2 = 2131755990(0x7f1003d6, float:1.9142875E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r2, r3)
            r0.updateBackBtn(r2)
        L_0x0030:
            com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$a r2 = new com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$a
            r2.<init>(r0)
            r0.setBackBtn(r2)
            android.view.Window r2 = r18.getWindow()
            android.view.View r2 = r2.getDecorView()
            java.lang.String r3 = "window.decorView"
            gy3.C87412m.m108593f(r2, r3)
            r3 = 1280(0x500, float:1.794E-42)
            r2.setSystemUiVisibility(r3)
            r2 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r2 = p385u2.C111105a.m151500b(r0, r2)
            r0.setActionbarColor(r2)
            r18.hideActionbarLine()
            android.content.Intent r2 = r18.getIntent()
            java.lang.String r3 = "key_track_data"
            byte[] r2 = r2.getByteArrayExtra(r3)
            if (r2 == 0) goto L_0x0069
            te3.p23 r3 = r0.f163116e
            r3.parseFrom(r2)
        L_0x0069:
            te3.p23 r2 = r0.f163116e
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f184739d
            r3 = 0
            if (r2 == 0) goto L_0x007b
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x007b
            te3.hb1 r2 = r2.mvInfo
            if (r2 == 0) goto L_0x007b
            java.util.LinkedList<te3.mb1> r2 = r2.f183460i
            goto L_0x007c
        L_0x007b:
            r2 = r3
        L_0x007c:
            java.lang.String r4 = "MicroMsg.MusicMvFreeMakerPreviewUI"
            if (r2 == 0) goto L_0x0152
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0088
            goto L_0x0152
        L_0x0088:
            te3.p23 r6 = r0.f163116e
            te3.hb1 r6 = r6.f184744i
            if (r6 == 0) goto L_0x0099
            te3.kb1 r6 = r6.f183456e
            if (r6 == 0) goto L_0x0099
            int r6 = r6.f183918u
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x009a
        L_0x0099:
            r6 = r3
        L_0x009a:
            if (r6 == 0) goto L_0x0149
            int r7 = r6.intValue()
            if (r7 > 0) goto L_0x00a4
            goto L_0x0149
        L_0x00a4:
            te3.p23 r7 = r0.f163116e
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r7.f184740e
            java.lang.String r8 = "trackData.refObjectList"
            gy3.C87412m.m108593f(r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = sx3.C36907w.m41090l(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x00bd:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00cf
            java.lang.Object r9 = r7.next()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r9
            java.lang.String r9 = r9.objectNonceId
            r8.add(r9)
            goto L_0x00bd
        L_0x00cf:
            java.util.Set r7 = sx3.C110818d0.m150904D0(r8)
            java.util.Iterator r8 = r2.iterator()
            r9 = 0
            r11 = r9
        L_0x00da:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0115
            java.lang.Object r13 = r8.next()
            te3.mb1 r13 = (te3.C64550mb1) r13
            int r14 = r13.f184259e
            long r14 = (long) r14
            long r11 = r11 + r14
            long r14 = r13.f184260f
            r16 = 1
            int r17 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r17 != 0) goto L_0x010b
            java.lang.String r14 = r13.f184261g
            if (r14 == 0) goto L_0x00ff
            int r14 = r14.length()
            if (r14 != 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r14 = 0
            goto L_0x0100
        L_0x00ff:
            r14 = 1
        L_0x0100:
            if (r14 != 0) goto L_0x010d
            java.lang.String r13 = r13.f184261g
            boolean r13 = r7.contains(r13)
            if (r13 != 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r16 = 0
        L_0x010d:
            if (r16 == 0) goto L_0x00da
            java.lang.String r2 = "default video has already been appended"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            goto L_0x016a
        L_0x0115:
            te3.mb1 r7 = new te3.mb1
            r7.<init>()
            r7.f184258d = r11
            int r6 = r6.intValue()
            long r13 = (long) r6
            long r13 = r13 - r11
            long r8 = java.lang.Math.max(r13, r9)
            int r6 = (int) r8
            r7.f184259e = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "append default video with "
            r6.append(r8)
            int r8 = r7.f184259e
            r6.append(r8)
            java.lang.String r8 = "ms duration"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            r2.add(r7)
            goto L_0x016a
        L_0x0149:
            java.lang.String r2 = "invalid music duration"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)
            r18.finish()
            goto L_0x016a
        L_0x0152:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "null or empty track list: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)
            r18.finish()
        L_0x016a:
            la2.n r2 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r2 = r2.mo138822a()
            r2.mo32203a(r5)
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r4 = r2.mo62444c(r0)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r1)
            java.lang.String r5 = "UICProvider.of(this).get…PreviewBgUIC::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            sb2.o0 r4 = (sb2.C63830o0) r4
            te3.p23 r5 = r0.f163116e
            java.lang.String r6 = r5.f184741f
            r4.f180943e = r6
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f184739d
            if (r5 == 0) goto L_0x01b4
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
            if (r5 == 0) goto L_0x01b4
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r5 = r5.media
            if (r5 == 0) goto L_0x01b4
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
            com.tencent.mm.protocal.protobuf.FinderMedia r5 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r5
            if (r5 == 0) goto L_0x01b4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.thumbUrl
            r6.append(r7)
            java.lang.String r5 = r5.thumb_url_token
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x01b5
        L_0x01b4:
            r5 = r3
        L_0x01b5:
            r4.f180944f = r5
            com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$b r5 = new com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$b
            r5.<init>()
            r4.mo88628e3(r5)
            te3.p23 r5 = r0.f163116e
            r4.f180945g = r5
            com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$c r5 = new com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$c
            r5.<init>()
            r4.mo88629f3(r5)
            bl3.r$a r5 = r2.mo62444c(r0)
            java.lang.Class<ob2.g> r6 = ob2.C61999g.class
            androidx.lifecycle.i0 r5 = r5.mo75002a(r6)
            ob2.g r5 = (ob2.C61999g) r5
            com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$d r6 = new com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$d
            java.lang.String r7 = ""
            gy3.C87412m.m108593f(r5, r7)
            r6.<init>(r5)
            r4.f180947i = r6
            te3.p23 r4 = r0.f163116e
            java.lang.String r6 = "mvData"
            gy3.C87412m.m108594g(r4, r6)
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r4.f184739d
            if (r6 == 0) goto L_0x01fa
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x01fa
            te3.hb1 r6 = r6.mvInfo
            if (r6 == 0) goto L_0x01fa
            java.util.LinkedList<te3.mb1> r6 = r6.f183460i
            goto L_0x01fb
        L_0x01fa:
            r6 = r3
        L_0x01fb:
            if (r6 != 0) goto L_0x0202
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
        L_0x0202:
            r5.f176254h = r6
            androidx.appcompat.app.AppCompatActivity r6 = r5.getActivity()
            r7 = 2131300592(0x7f0910f0, float:1.8219218E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "activity.findViewById(R.id.crop_thumb_view)"
            gy3.C87412m.m108593f(r6, r7)
            com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r6 = (com.tencent.p014mm.plugin.p081mv.p082ui.widget.MvTracksEditView) r6
            r5.f176250d = r6
            androidx.appcompat.app.AppCompatActivity r6 = r5.getActivity()
            r7 = 2131300054(0x7f090ed6, float:1.8218127E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r8 = "activity.findViewById(R.id.complete_btn)"
            gy3.C87412m.m108593f(r6, r8)
            android.widget.Button r6 = (android.widget.Button) r6
            r5.f176252f = r6
            androidx.appcompat.app.AppCompatActivity r6 = r5.getActivity()
            r8 = 2131298623(0x7f09093f, float:1.8215224E38)
            android.view.View r6 = r6.findViewById(r8)
            java.lang.String r8 = "activity.findViewById(R.id.cancel_select_button)"
            gy3.C87412m.m108593f(r6, r8)
            androidx.appcompat.app.AppCompatActivity r8 = r5.getActivity()
            r9 = 2131300055(0x7f090ed7, float:1.8218129E38)
            android.view.View r8 = r8.findViewById(r9)
            java.lang.String r9 = "activity.findViewById(R.id.complete_select_button)"
            gy3.C87412m.m108593f(r8, r9)
            androidx.appcompat.app.AppCompatActivity r9 = r5.getActivity()
            r10 = 2131313068(0x7f0941ac, float:1.8244522E38)
            android.view.View r9 = r9.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.…select_buttons_container)"
            gy3.C87412m.m108593f(r9, r10)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r5.f176251e = r9
            com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r9 = r5.f176250d
            java.lang.String r10 = "tracksEditView"
            if (r9 == 0) goto L_0x030b
            rb2.a r11 = r5.f176261r
            r9.setThumbLoader(r11)
            ob2.a r9 = new ob2.a
            r9.<init>(r5)
            r6.setOnClickListener(r9)
            ob2.b r6 = new ob2.b
            r6.<init>(r5)
            r8.setOnClickListener(r6)
            androidx.appcompat.app.AppCompatActivity r6 = r5.getActivity()
            bl3.r$a r6 = r2.mo62444c(r6)
            androidx.lifecycle.i0 r1 = r6.mo75002a(r1)
            java.lang.String r6 = "UICProvider.of(activity)…PreviewBgUIC::class.java)"
            gy3.C87412m.m108593f(r1, r6)
            sb2.o0 r1 = (sb2.C63830o0) r1
            androidx.appcompat.app.AppCompatActivity r6 = r5.getActivity()
            r8 = 2131300803(0x7f0911c3, float:1.8219646E38)
            android.view.View r6 = r6.findViewById(r8)
            java.lang.String r8 = "activity.findViewById(R.id.delete_item_container)"
            gy3.C87412m.m108593f(r6, r8)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r5.f176253g = r6
            androidx.appcompat.app.AppCompatActivity r6 = r5.getActivity()
            r8 = 2131300812(0x7f0911cc, float:1.8219664E38)
            android.view.View r6 = r6.findViewById(r8)
            java.lang.String r8 = "activity.findViewById(R.id.deleted_tips_tv)"
            gy3.C87412m.m108593f(r6, r8)
            android.widget.TextView r6 = (android.widget.TextView) r6
            gy3.a0 r8 = new gy3.a0
            r8.<init>()
            com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r9 = r5.f176250d
            if (r9 == 0) goto L_0x0307
            ob2.c r10 = new ob2.c
            r10.<init>(r1, r5, r8, r6)
            r9.setCallback(r10)
            a14.n0 r11 = r5.f176255i
            r12 = 0
            r13 = 0
            ob2.d r14 = new ob2.d
            r14.<init>(r4, r5, r3)
            r15 = 3
            r16 = 0
            a14.C53895h.m60466d(r11, r12, r13, r14, r15, r16)
            android.view.View r1 = r0.findViewById(r7)
            android.widget.Button r1 = (android.widget.Button) r1
            if (r1 == 0) goto L_0x02e5
            com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$e r4 = new com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI$e
            r4.<init>(r0)
            r1.setOnClickListener(r4)
        L_0x02e5:
            bl3.r$a r1 = r2.mo62444c(r0)
            java.lang.Class<sb2.p0> r2 = sb2.C101580p0.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            sb2.p0 r1 = (sb2.C101580p0) r1
            te3.p23 r2 = r0.f163116e
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f184739d
            if (r2 == 0) goto L_0x0301
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x0301
            te3.hb1 r2 = r2.mvInfo
            if (r2 == 0) goto L_0x0301
            te3.kb1 r3 = r2.f183456e
        L_0x0301:
            r1.f297383e = r3
            r1.mo141057c3()
            return
        L_0x0307:
            gy3.C87412m.m108603p(r10)
            throw r3
        L_0x030b:
            gy3.C87412m.m108603p(r10)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.free.MusicMvFreeMakerPreviewUI.onCreate(android.os.Bundle):void");
    }

    public void onPause() {
        super.onPause();
        Log.printDebugStack("MicroMsg.GlobalMusicMvFloatBallUtil", "alvinluo Mv onPause hideAllFloatBall: %s, resumeFloatBall: %b", Boolean.FALSE, Boolean.valueOf(true & true));
    }

    public void onResume() {
        super.onResume();
        if (!this.f163117f) {
            this.f163117f = false;
        }
    }
}
