package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorInputView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.item.EditorItemContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import h90.C98324b;
import ih2.C60287a;
import kotlin.Metadata;
import lh2.C109339f0;
import lh2.C109344g0;
import lh2.C109348i;
import lh2.C109352j;
import lh2.C109359m;
import lh2.C76698a0;
import lh2.C76700q;
import lh2.C99418b0;
import lh2.C99420c0;
import lh2.C99426e;
import lh2.C99431f1;
import lh2.C99444h;
import lh2.C99447k;
import lh2.C99448l;
import lh2.C99451n;
import mh2.C99896a;
import nj3.C76879j;
import ph2.C110214a;
import qh2.C101198e;
import qo3.C89779i0;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H&R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0004X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0004X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0004X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010.\u001a\u00020)8\u0004X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00104\u001a\u00020/8\u0004X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010:\u001a\u0002058\u0004X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010@\u001a\u00020;8\u0004X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010F\u001a\u00020A8\u0004X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010L\u001a\u00020G8\u0004X\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010R\u001a\u00020M8\u0004X\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010X\u001a\u00020S8\u0004X\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010^\u001a\u00020Y8\u0004X\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010d\u001a\u00020_8\u0004X\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010j\u001a\u00020e8\u0004X\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010p\u001a\u00020k8\u0004X\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR$\u0010x\u001a\u0004\u0018\u00010q8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR%\u0010\u0001\u001a\u0004\u0018\u00010y8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseEditVideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lqh2/e;", "", "getLayoutId", "Landroid/view/View;", "getPlayerView", "Lwg2/a;", "h", "Lwg2/a;", "getNavigator", "()Lwg2/a;", "setNavigator", "(Lwg2/a;)V", "navigator", "Llh2/f0;", "i", "Llh2/f0;", "getPreviewPlugin", "()Llh2/f0;", "setPreviewPlugin", "(Llh2/f0;)V", "previewPlugin", "Llh2/e;", "j", "Llh2/e;", "getAddEmojiPlugin", "()Llh2/e;", "addEmojiPlugin", "Llh2/n;", "n", "Llh2/n;", "getItemContainerPlugin", "()Llh2/n;", "itemContainerPlugin", "Llh2/c0;", "o", "Llh2/c0;", "getVideoControlContainerPlugin", "()Llh2/c0;", "videoControlContainerPlugin", "Llh2/i;", "p", "Llh2/i;", "getAddTextPlugin", "()Llh2/i;", "addTextPlugin", "Llh2/j;", "q", "Llh2/j;", "getAddTipPlugin", "()Llh2/j;", "addTipPlugin", "Llh2/h;", "r", "Llh2/h;", "getAddPoiPlugin", "()Llh2/h;", "addPoiPlugin", "Lph2/a;", "s", "Lph2/a;", "getAddMusicPlugin", "()Lph2/a;", "addMusicPlugin", "Lmh2/a;", "t", "Lmh2/a;", "getCropVideoPlugin", "()Lmh2/a;", "cropVideoPlugin", "Llh2/l;", "u", "Llh2/l;", "getEditFinishPlugin", "()Llh2/l;", "editFinishPlugin", "Llh2/k;", "v", "Llh2/k;", "getBackToRecordPlugin", "()Llh2/k;", "backToRecordPlugin", "Llh2/f1;", "w", "Llh2/f1;", "getReMuxPlugin", "()Llh2/f1;", "reMuxPlugin", "Llh2/a0;", "x", "Llh2/a0;", "getAddonTextPlugin", "()Llh2/a0;", "addonTextPlugin", "Llh2/b0;", "y", "Llh2/b0;", "getBgPlugin", "()Llh2/b0;", "bgPlugin", "Llh2/q;", "z", "Llh2/q;", "getMoreMenuPlugin", "()Llh2/q;", "moreMenuPlugin", "Llh2/m;", "A", "Llh2/m;", "getInputPlugin", "()Llh2/m;", "inputPlugin", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "B", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "getConfigProvider", "()Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "setConfigProvider", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "configProvider", "Lh90/b;", "C", "Lh90/b;", "getCaptureInfo", "()Lh90/b;", "setCaptureInfo", "(Lh90/b;)V", "captureInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout */
public abstract class BaseEditVideoPluginLayout extends BasePluginLayout implements C101198e {

    /* renamed from: A */
    public final C109359m f272952A;

    /* renamed from: B */
    public RecordConfigProvider f272953B;

    /* renamed from: C */
    public C98324b f272954C;

    /* renamed from: D */
    public C89779i0 f272955D;

    /* renamed from: h */
    public C102440a f272956h;

    /* renamed from: i */
    public C109339f0 f272957i;

    /* renamed from: j */
    public final C99426e f272958j;

    /* renamed from: n */
    public final C99451n f272959n;

    /* renamed from: o */
    public final C99420c0 f272960o;

    /* renamed from: p */
    public final C109348i f272961p;

    /* renamed from: q */
    public final C109352j f272962q;

    /* renamed from: r */
    public final C99444h f272963r;

    /* renamed from: s */
    public final C110214a f272964s;

    /* renamed from: t */
    public final C99896a f272965t;

    /* renamed from: u */
    public final C99448l f272966u;

    /* renamed from: v */
    public final C99447k f272967v;

    /* renamed from: w */
    public final C99431f1 f272968w;

    /* renamed from: x */
    public final C76698a0 f272969x;

    /* renamed from: y */
    public final C99418b0 f272970y;

    /* renamed from: z */
    public final C76700q f272971z;

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout$a */
    public static final class C94408a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BaseEditVideoPluginLayout f272972d;

        /* renamed from: e */
        public final /* synthetic */ String f272973e;

        public C94408a(BaseEditVideoPluginLayout baseEditVideoPluginLayout, String str) {
            this.f272972d = baseEditVideoPluginLayout;
            this.f272973e = str;
        }

        public final void run() {
            BaseEditVideoPluginLayout baseEditVideoPluginLayout = this.f272972d;
            baseEditVideoPluginLayout.f272955D = C76879j.m92723Q(baseEditVideoPluginLayout.getContext(), "", this.f272973e, true, false, (DialogInterface.OnCancelListener) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseEditVideoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        C99431f1 f1Var = new C99431f1(context2);
        this.f272968w = f1Var;
        Log.m105924i("MicroMsg.EditorVideoPluginLayout", "EditorVideoPluginLayoutNew invoke init");
        LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        View playerView = getPlayerView();
        ViewStub viewStub = (ViewStub) findViewById(C0966R.C0970id.hwn);
        ViewParent parent = viewStub.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewAt(indexOfChild);
        viewGroup.addView(playerView, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
        View findViewById = findViewById(C0966R.C0970id.cbs);
        C87412m.m108593f(findViewById, "findViewById(R.id.editor_add_emoji)");
        C99426e eVar = new C99426e(this, (ImageView) findViewById, this);
        this.f272958j = eVar;
        View findViewById2 = findViewById(C0966R.C0970id.cck);
        C87412m.m108593f(findViewById2, "findViewById(R.id.editor_item_container)");
        C99451n nVar = new C99451n((EditorItemContainer) findViewById2, this);
        this.f272959n = nVar;
        View findViewById3 = findViewById(C0966R.C0970id.bsv);
        C87412m.m108593f(findViewById3, "findViewById(R.id.control_container)");
        C99420c0 c0Var = new C99420c0((ViewGroup) findViewById3, this);
        this.f272960o = c0Var;
        View findViewById4 = findViewById(C0966R.C0970id.azh);
        C87412m.m108593f(findViewById4, "findViewById(R.id.change_text_root)");
        C109359m mVar = new C109359m((EditorInputView) findViewById4, this);
        this.f272952A = mVar;
        C109348i iVar = new C109348i(this, this, mVar.f327377f);
        this.f272961p = iVar;
        C110214a aVar = new C110214a(this, this);
        this.f272964s = aVar;
        C99896a aVar2 = new C99896a(this, this);
        this.f272965t = aVar2;
        View findViewById5 = findViewById(C0966R.C0970id.cco);
        C87412m.m108593f(findViewById5, "findViewById(R.id.editor_mix)");
        C99448l lVar = new C99448l(findViewById5, this);
        this.f272966u = lVar;
        View findViewById6 = findViewById(C0966R.C0970id.cc8);
        C87412m.m108593f(findViewById6, "findViewById(R.id.editor_close)");
        C99447k kVar = new C99447k((ImageView) findViewById6, this);
        this.f272967v = kVar;
        View findViewById7 = findViewById(C0966R.C0970id.cno);
        C87412m.m108593f(findViewById7, "findViewById(R.id.ext_text_area)");
        C76698a0 a0Var = new C76698a0((TextView) findViewById7, this);
        this.f272969x = a0Var;
        View findViewById8 = findViewById(C0966R.C0970id.iih);
        C87412m.m108593f(findViewById8, "findViewById(R.id.recorder_black_mask)");
        C99418b0 b0Var = new C99418b0((ImageView) findViewById8, this);
        this.f272970y = b0Var;
        C109352j jVar = new C109352j(this, this, mVar.f327377f);
        this.f272962q = jVar;
        C99444h hVar = new C99444h(this, this);
        this.f272963r = hVar;
        C76700q qVar = new C76700q(this, this);
        this.f272971z = qVar;
        getPluginList().add(eVar);
        getPluginList().add(nVar);
        getPluginList().add(c0Var);
        getPluginList().add(iVar);
        getPluginList().add(aVar);
        getPluginList().add(aVar2);
        getPluginList().add(lVar);
        getPluginList().add(f1Var);
        getPluginList().add(kVar);
        getPluginList().add(a0Var);
        getPluginList().add(b0Var);
        getPluginList().add(jVar);
        getPluginList().add(hVar);
        getPluginList().add(qVar);
        float f = (float) C60287a.f171907b;
        float f2 = (float) C60287a.f171906a;
        float f3 = f / f2;
        float f4 = f / 2.18f;
        float f5 = (float) 2;
        float f6 = (f2 - f4) / f5;
        float f7 = f2 * 1.78f;
        float f8 = (f - f7) / f5;
        if (f3 <= 1.78f) {
            mVar.mo160552y(f4, f6);
            nVar.mo138895j(f4, f6);
        } else if (f3 >= 2.18f) {
            mVar.mo160551x(f4, f6);
            nVar.mo138894i(f7, f8);
        } else {
            mVar.mo160552y(f4, f6);
            mVar.mo160551x(f4, f6);
            nVar.mo138895j(f4, f6);
            nVar.mo138894i(f7, f8);
        }
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    public final C99426e getAddEmojiPlugin() {
        return this.f272958j;
    }

    public final C110214a getAddMusicPlugin() {
        return this.f272964s;
    }

    public final C99444h getAddPoiPlugin() {
        return this.f272963r;
    }

    public final C109348i getAddTextPlugin() {
        return this.f272961p;
    }

    public final C109352j getAddTipPlugin() {
        return this.f272962q;
    }

    public final C76698a0 getAddonTextPlugin() {
        return this.f272969x;
    }

    public final C99447k getBackToRecordPlugin() {
        return this.f272967v;
    }

    public final C99418b0 getBgPlugin() {
        return this.f272970y;
    }

    public final C98324b getCaptureInfo() {
        return this.f272954C;
    }

    public final RecordConfigProvider getConfigProvider() {
        return this.f272953B;
    }

    public final C99896a getCropVideoPlugin() {
        return this.f272965t;
    }

    public final C99448l getEditFinishPlugin() {
        return this.f272966u;
    }

    public final C109359m getInputPlugin() {
        return this.f272952A;
    }

    public final C99451n getItemContainerPlugin() {
        return this.f272959n;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cbe;
    }

    public final C76700q getMoreMenuPlugin() {
        return this.f272971z;
    }

    public final C102440a getNavigator() {
        return this.f272956h;
    }

    public abstract View getPlayerView();

    public final C109339f0 getPreviewPlugin() {
        C109339f0 f0Var = this.f272957i;
        if (f0Var != null) {
            return f0Var;
        }
        C87412m.m108603p("previewPlugin");
        throw null;
    }

    public final C99431f1 getReMuxPlugin() {
        return this.f272968w;
    }

    public final C99420c0 getVideoControlContainerPlugin() {
        return this.f272960o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014f  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo128671k(wg2.C102440a r14, com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r15) {
        /*
            r13 = this;
            java.lang.String r0 = "navigator"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "configProvider"
            gy3.C87412m.m108594g(r15, r0)
            super.mo128671k(r14, r15)
            r13.f272956h = r14
            r13.f272953B = r15
            hi2.h r14 = hi2.C98453h.f288774a
            r14.mo137806d(r15)
            lh2.n r14 = r13.f272959n
            r14.getClass()
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r14 = r14.f291592d
            r14.getClass()
            r14.f273067u = r15
            ph2.a r14 = r13.f272964s
            r0 = 0
            r14.setVisibility(r0)
            mh2.a r14 = r13.f272965t
            android.widget.ImageView r14 = r14.f292721f
            r14.setVisibility(r0)
            lh2.l r14 = r13.f272966u
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r15.f272927o
            r2 = 0
            if (r1 == 0) goto L_0x003e
            int r1 = r1.f266576i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r15.f272927o
            if (r3 == 0) goto L_0x004a
            int r3 = r3.f266577j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x004b
        L_0x004a:
            r3 = r2
        L_0x004b:
            com.tencent.mm.component.api.jumper.UICustomParam r4 = r15.f272927o
            if (r4 == 0) goto L_0x0052
            java.lang.String r5 = r4.f266579o
            goto L_0x0053
        L_0x0052:
            r5 = r2
        L_0x0053:
            if (r4 == 0) goto L_0x005c
            int r4 = r4.f266578n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x005d
        L_0x005c:
            r4 = r2
        L_0x005d:
            r14.mo138884a(r1, r3, r5, r4)
            ph2.a r6 = r13.f272964s
            com.tencent.mm.component.api.jumper.UICustomParam r14 = r15.f272927o
            if (r14 == 0) goto L_0x006e
            int r14 = r14.f266576i
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r7 = r14
            goto L_0x006f
        L_0x006e:
            r7 = r2
        L_0x006f:
            com.tencent.mm.component.api.jumper.UICustomParam r14 = r15.f272927o
            if (r14 == 0) goto L_0x007b
            int r14 = r14.f266577j
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r8 = r14
            goto L_0x007c
        L_0x007b:
            r8 = r2
        L_0x007c:
            r9 = 0
            r10 = 0
            r11 = 8
            r12 = 0
            ph2.C110214a.m149813d(r6, r7, r8, r9, r10, r11, r12)
            lh2.a0 r14 = r13.f272969x
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r15.f272927o
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r1.f266580p
            goto L_0x008e
        L_0x008d:
            r1 = r2
        L_0x008e:
            r14.getClass()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r4 = 8
            if (r3 == 0) goto L_0x009f
            android.widget.TextView r14 = r14.f224399d
            r14.setVisibility(r4)
            goto L_0x00a9
        L_0x009f:
            android.widget.TextView r3 = r14.f224399d
            r3.setVisibility(r0)
            android.widget.TextView r14 = r14.f224399d
            r14.setText(r1)
        L_0x00a9:
            lh2.i r14 = r13.f272961p
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r15.f272927o
            if (r1 == 0) goto L_0x00b6
            int r1 = r1.f266576i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00b7
        L_0x00b6:
            r1 = r2
        L_0x00b7:
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r15.f272927o
            if (r3 == 0) goto L_0x00c2
            int r3 = r3.f266577j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00c3
        L_0x00c2:
            r3 = r2
        L_0x00c3:
            r14.mo160547y(r1, r3)
            mh2.a r14 = r13.f272965t
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r15.f272927o
            if (r1 == 0) goto L_0x00d3
            int r1 = r1.f266576i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00d4
        L_0x00d3:
            r1 = r2
        L_0x00d4:
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r15.f272927o
            if (r3 == 0) goto L_0x00de
            int r2 = r3.f266577j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x00de:
            com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView r14 = r14.f292722g
            android.widget.Button r14 = r14.getFinishButton()
            if (r14 == 0) goto L_0x010c
            if (r1 == 0) goto L_0x00f5
            int r3 = r1.intValue()
            if (r3 == 0) goto L_0x00f5
            int r1 = r1.intValue()
            r14.setBackgroundResource(r1)
        L_0x00f5:
            if (r2 == 0) goto L_0x010c
            int r1 = r2.intValue()
            if (r1 == 0) goto L_0x010c
            android.content.Context r1 = r14.getContext()
            int r2 = r2.intValue()
            int r1 = p385u2.C111105a.m151500b(r1, r2)
            r14.setTextColor(r1)
        L_0x010c:
            lh2.q r14 = r13.f272971z
            int r1 = r15.f272905F
            r14.mo106975b(r1)
            java.util.ArrayList r14 = r13.getPluginList()
            java.util.Iterator r14 = r14.iterator()
        L_0x011b:
            boolean r1 = r14.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x0155
            java.lang.Object r1 = r14.next()
            lh2.g0 r1 = (lh2.C109344g0) r1
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r15.f272927o
            if (r3 == 0) goto L_0x0149
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r3.f266575h
            if (r3 == 0) goto L_0x0149
            hi2.w r5 = hi2.C108249w.f324119a
            java.lang.String r6 = r1.name()
            java.lang.String r5 = r5.mo158634a(r6)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x0149
            boolean r3 = r3.booleanValue()
            goto L_0x014a
        L_0x0149:
            r3 = 0
        L_0x014a:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x014f
            r2 = 0
            goto L_0x0151
        L_0x014f:
            r2 = 8
        L_0x0151:
            r1.setVisibility(r2)
            goto L_0x011b
        L_0x0155:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r14 = r13.f272953B
            if (r14 == 0) goto L_0x0165
            android.os.Bundle r14 = r14.f272912M
            if (r14 == 0) goto L_0x0165
            java.lang.String r15 = "key_edit_enable_emoji_search"
            boolean r14 = r14.getBoolean(r15, r0)
            goto L_0x0166
        L_0x0165:
            r14 = 0
        L_0x0166:
            java.lang.Class<s00.f> r15 = s00.C90110f.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            s00.f r15 = (s00.C90110f) r15
            boolean r15 = r15.a60()
            if (r14 == 0) goto L_0x0177
            if (r15 == 0) goto L_0x0177
            r0 = 1
        L_0x0177:
            if (r0 == 0) goto L_0x017e
            lh2.e r0 = r13.f272958j
            r0.mo138865x()
        L_0x017e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkShowEmojiSearch: needShow=["
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = "], isXWebKernelAvailable:["
            r0.append(r14)
            r0.append(r15)
            r14 = 93
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            java.lang.String r15 = "MicroMsg.EditorVideoPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout.mo128671k(wg2.a, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        super.mo129855l(bVar);
        this.f272954C = bVar;
    }

    /* renamed from: m */
    public final void mo129856m(String str) {
        C87412m.m108594g(str, "tip");
        Log.m105924i("MicroMsg.EditorVideoPluginLayout", "showDialog");
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).runOnUiThread(new C94408a(this, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:289:0x06dc  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14585p(qh2.C101198e.C101199b r32, android.os.Bundle r33) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            r2 = r33
            java.lang.String r3 = "status"
            gy3.C87412m.m108594g(r0, r3)
            qh2.e$b r3 = qh2.C101198e.C101199b.EDIT_CROP_VIDEO_PERCENT
            java.lang.String r4 = "MicroMsg.EditorVideoPluginLayout"
            if (r0 == r3) goto L_0x002f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "statusChange "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = " ,param : "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
        L_0x002f:
            int r3 = r32.ordinal()
            r5 = 29
            if (r3 == r5) goto L_0x0820
            r5 = 30
            if (r3 == r5) goto L_0x0807
            r5 = 37
            r9 = -1
            java.lang.String r10 = "PARAM_EDIT_TEXT_COLOR_BG_INT"
            java.lang.String r11 = "PARAM_EDIT_TEXT_COLOR"
            java.lang.String r12 = "PARAM_EDIT_TEXT_CONTENT"
            r15 = 0
            r13 = 1
            r14 = 0
            if (r3 == r5) goto L_0x076d
            r5 = 104(0x68, float:1.46E-43)
            if (r3 == r5) goto L_0x06e5
            r5 = 63
            if (r3 == r5) goto L_0x058e
            r5 = 64
            if (r3 == r5) goto L_0x0578
            java.lang.String r5 = "EDIT_CROP_VIDEO_CURRENT_TIME_INT"
            switch(r3) {
                case 32: goto L_0x026b;
                case 33: goto L_0x026b;
                case 34: goto L_0x026b;
                case 35: goto L_0x0087;
                default: goto L_0x005a;
            }
        L_0x005a:
            r6 = 24
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r8 = 44
            java.lang.String r9 = ""
            switch(r3) {
                case 40: goto L_0x01d2;
                case 41: goto L_0x00e3;
                case 42: goto L_0x00ca;
                case 43: goto L_0x00a8;
                case 44: goto L_0x009f;
                case 45: goto L_0x026b;
                default: goto L_0x0066;
            }
        L_0x0066:
            switch(r3) {
                case 48: goto L_0x026b;
                case 49: goto L_0x0250;
                case 50: goto L_0x0237;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.String r6 = "KEY_EXIT_CROP_PAGE_TIME_MS_LONG"
            switch(r3) {
                case 52: goto L_0x04f9;
                case 53: goto L_0x0367;
                case 54: goto L_0x035e;
                case 55: goto L_0x033a;
                case 56: goto L_0x0316;
                case 57: goto L_0x030b;
                case 58: goto L_0x0300;
                case 59: goto L_0x029e;
                case 60: goto L_0x0275;
                default: goto L_0x006e;
            }
        L_0x006e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unknown status "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x0087:
            if (r2 == 0) goto L_0x009b
            int r0 = r2.getInt(r5)
            lh2.f0 r2 = r31.getPreviewPlugin()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r2 = r2.f327322d
            if (r2 == 0) goto L_0x0099
            double r3 = (double) r0
            r2.mo24787a(r3, r13)
        L_0x0099:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x009b:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x009f:
            lh2.h r0 = r1.f272963r
            r0.mo138879a()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x00a8:
            if (r2 == 0) goto L_0x00c6
            java.lang.CharSequence r0 = r2.getCharSequence(r12)
            int r3 = r2.getInt(r11)
            int r2 = r2.getInt(r10)
            lh2.j r4 = r1.f272962q
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView r5 = r4.f327368f
            r5.f315581E = r13
            r5.setShow(r13)
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView r4 = r4.f327368f
            r4.mo151431g(r0, r3, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x00c6:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x00ca:
            if (r2 == 0) goto L_0x00df
            java.lang.CharSequence r0 = r2.getCharSequence(r12)
            int r3 = r2.getInt(r11)
            int r2 = r2.getInt(r10)
            lh2.i r4 = r1.f272961p
            r4.mo160546x(r0, r3, r2, r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x00df:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x00e3:
            if (r2 == 0) goto L_0x01ce
            java.lang.String r0 = "PARAM_EDIT_POI_INFO"
            byte[] r0 = r2.getByteArray(r0)
            lh2.n r2 = r1.f272959n
            te3.cp3 r3 = new te3.cp3
            r3.<init>()
            pe3.a r0 = r3.parseFrom(r0)
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RecordLocationInfo"
            gy3.C87412m.m108592e(r0, r3)
            te3.cp3 r0 = (te3.C101765cp3) r0
            r2.getClass()
            java.lang.String r3 = r0.f298036g
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0114
            java.lang.String r3 = r0.f298035f
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r3 = 0
            goto L_0x0115
        L_0x0114:
            r3 = 1
        L_0x0115:
            if (r3 == 0) goto L_0x0142
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r2 = r2.f291592d
            ai2.r r3 = r2.f273048A
            if (r3 == 0) goto L_0x011f
            r3 = 1
            goto L_0x0120
        L_0x011f:
            r3 = 0
        L_0x0120:
            if (r3 == 0) goto L_0x013e
            r2.getClass()
            ai2.r r3 = r2.f273048A
            if (r3 != 0) goto L_0x012a
            goto L_0x015d
        L_0x012a:
            ai2.e r4 = ai2.C27904e.f77076d
            if (r3 == 0) goto L_0x0133
            android.view.ViewGroup r5 = r2.f273059j
            r5.removeView(r3)
        L_0x0133:
            r2.f273048A = r15
            if (r4 == 0) goto L_0x013a
            r4.invoke()
        L_0x013a:
            r2.mo129899e(r0)
            goto L_0x015d
        L_0x013e:
            r2.mo129899e(r0)
            goto L_0x015d
        L_0x0142:
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r2.f291592d
            ai2.r r2 = r0.f273048A
            if (r2 == 0) goto L_0x014a
            r3 = 1
            goto L_0x014b
        L_0x014a:
            r3 = 0
        L_0x014b:
            if (r3 == 0) goto L_0x015d
            lh2.o r3 = lh2.C34277o.f92393d
            if (r2 == 0) goto L_0x0156
            android.view.ViewGroup r4 = r0.f273059j
            r4.removeView(r2)
        L_0x0156:
            r0.f273048A = r15
            if (r3 == 0) goto L_0x015d
            r3.invoke()
        L_0x015d:
            lh2.n r0 = r1.f272959n
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            int r0 = r0.getLocationItemHeight()
            if (r0 != 0) goto L_0x0169
            r2 = 0
            goto L_0x0171
        L_0x0169:
            android.content.Context r2 = r31.getContext()
            int r2 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r2, r6)
        L_0x0171:
            int r2 = r2 + r0
            android.content.Context r0 = r31.getContext()
            int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r8)
            int r2 = r2 + r0
            lh2.n r0 = r1.f272959n
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r3 = r0.f291592d
            ai2.u r4 = r3.f273050C
            if (r4 == 0) goto L_0x0185
            r4 = 1
            goto L_0x0186
        L_0x0185:
            r4 = 0
        L_0x0186:
            if (r4 == 0) goto L_0x01ba
            ai2.u r3 = r3.getTipItemView()
            if (r3 == 0) goto L_0x019c
            java.lang.CharSequence r3 = r3.getText()
            if (r3 == 0) goto L_0x019c
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x019b
            goto L_0x019c
        L_0x019b:
            r9 = r3
        L_0x019c:
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r3 = r0.f291592d
            ai2.u r3 = r3.getTipItemView()
            if (r3 == 0) goto L_0x01a9
            int r3 = r3.getColor()
            goto L_0x01aa
        L_0x01a9:
            r3 = 0
        L_0x01aa:
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r4 = r0.f291592d
            ai2.u r4 = r4.getTipItemView()
            if (r4 == 0) goto L_0x01b6
            int r14 = r4.getTextBg()
        L_0x01b6:
            r0.mo138887a(r9, r3, r14)
            goto L_0x01bb
        L_0x01ba:
            r13 = 0
        L_0x01bb:
            if (r13 != 0) goto L_0x01cc
            lh2.j r0 = r1.f272962q
            android.widget.RelativeLayout r0 = r0.f327369g
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            gy3.C87412m.m108592e(r0, r7)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.bottomMargin = r2
        L_0x01cc:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x01ce:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x01d2:
            if (r2 == 0) goto L_0x0233
            java.lang.CharSequence r0 = r2.getCharSequence(r12)
            int r3 = r2.getInt(r11)
            int r2 = r2.getInt(r10)
            if (r0 == 0) goto L_0x01ea
            int r4 = r0.length()
            if (r4 != 0) goto L_0x01e9
            goto L_0x01ea
        L_0x01e9:
            r13 = 0
        L_0x01ea:
            if (r13 == 0) goto L_0x0228
            lh2.n r0 = r1.f272959n
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            ai2.u r2 = r0.f273050C
            if (r2 == 0) goto L_0x01fb
            android.view.ViewGroup r3 = r0.f273059j
            r3.removeView(r2)
            r0.f273050C = r15
        L_0x01fb:
            lh2.n r0 = r1.f272959n
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            int r0 = r0.getLocationItemHeight()
            if (r0 != 0) goto L_0x0206
            goto L_0x020e
        L_0x0206:
            android.content.Context r2 = r31.getContext()
            int r14 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r2, r6)
        L_0x020e:
            int r14 = r14 + r0
            android.content.Context r0 = r31.getContext()
            int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r8)
            int r14 = r14 + r0
            lh2.j r0 = r1.f272962q
            android.widget.RelativeLayout r0 = r0.f327369g
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            gy3.C87412m.m108592e(r0, r7)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.bottomMargin = r14
            goto L_0x0231
        L_0x0228:
            lh2.n r4 = r1.f272959n
            java.lang.String r0 = r0.toString()
            r4.mo138887a(r0, r3, r2)
        L_0x0231:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0233:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x0237:
            if (r2 == 0) goto L_0x024c
            java.lang.String r0 = "PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN"
            boolean r0 = r2.getBoolean(r0)
            lh2.f0 r2 = r31.getPreviewPlugin()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r2 = r2.f327322d
            if (r2 == 0) goto L_0x024a
            r2.setMute(r0)
        L_0x024a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x024c:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x0250:
            lh2.c0 r0 = r1.f272960o
            r0.setVisibility(r14)
            lh2.n r0 = r1.f272959n
            ai2.t r2 = r0.f291594f
            if (r2 != 0) goto L_0x025c
            goto L_0x025f
        L_0x025c:
            r2.setVisibility(r14)
        L_0x025f:
            ai2.u r0 = r0.f291595g
            if (r0 != 0) goto L_0x0264
            goto L_0x0267
        L_0x0264:
            r0.setVisibility(r14)
        L_0x0267:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x026b:
            lh2.c0 r0 = r1.f272960o
            r2 = 4
            r0.setVisibility(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x0275:
            lh2.c0 r0 = r1.f272960o
            r0.setVisibility(r14)
            ph2.a r0 = r1.f272964s
            r0.mo161619b()
            lh2.f0 r0 = r31.getPreviewPlugin()
            r0.mo160539b(r13)
            lh2.n r0 = r1.f272959n
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            r0.setEnableTouch(r13)
            th2.d r0 = th2.C110992d.f332425a
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo162677k(r6, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x029e:
            h90.b r0 = r1.f272954C
            if (r0 == 0) goto L_0x02fc
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r1.f272953B
            if (r2 == 0) goto L_0x02a9
            int r2 = r2.f272935w
            goto L_0x02ab
        L_0x02a9:
            r2 = 10000(0x2710, float:1.4013E-41)
        L_0x02ab:
            int r3 = r0.f288184e
            int r0 = r0.f288183d
            int r3 = r3 - r0
            int r2 = r2 + 250
            if (r3 <= r2) goto L_0x02da
            th2.f r0 = th2.C101891f.f300035a
            r2 = 3
            r4 = 2
            r0.mo141375i(r4, r2)
            android.content.Context r0 = r31.getContext()
            java.lang.String r2 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r0, r2)
            android.app.Activity r0 = (android.app.Activity) r0
            r3 = 3000(0xbb8, float:4.204E-42)
            r0.setResult(r3)
            android.content.Context r0 = r31.getContext()
            gy3.C87412m.m108592e(r0, r2)
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x02da:
            lh2.c0 r0 = r1.f272960o
            r0.setVisibility(r14)
            lh2.f0 r0 = r31.getPreviewPlugin()
            r0.mo160539b(r14)
            lh2.n r0 = r1.f272959n
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            r0.setEnableTouch(r13)
            th2.d r0 = th2.C110992d.f332425a
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo162677k(r6, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x02fc:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x0300:
            lh2.f0 r0 = r31.getPreviewPlugin()
            r0.onResume()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x030b:
            lh2.f0 r0 = r31.getPreviewPlugin()
            r0.onPause()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x0316:
            if (r2 == 0) goto L_0x0336
            int r0 = r2.getInt(r5)
            mh2.a r2 = r1.f272965t
            com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView r3 = r2.f292722g
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0334
            com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView r2 = r2.f292722g
            com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar r2 = r2.f272945d
            float r0 = (float) r0
            int r3 = r2.getDurationMs()
            float r3 = (float) r3
            float r0 = r0 / r3
            r2.setCurrentCursorPosition(r0)
        L_0x0334:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0336:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x033a:
            if (r2 == 0) goto L_0x035a
            java.lang.String r0 = "EDIT_CROP_VIDEO_LENGTH_START_TIME_INT"
            int r0 = r2.getInt(r0)
            java.lang.String r3 = "EDIT_CROP_VIDEO_LENGTH_END_TIME_INT"
            int r2 = r2.getInt(r3)
            lh2.f0 r3 = r31.getPreviewPlugin()
            r3.f327330o = r0
            r3.f327331p = r2
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r2 = r3.f327322d
            if (r2 == 0) goto L_0x0358
            double r3 = (double) r0
            r2.mo24787a(r3, r13)
        L_0x0358:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x035a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x035e:
            mh2.a r0 = r1.f272965t
            r0.mo139240a(r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x0367:
            lh2.c0 r0 = r1.f272960o
            r3 = 4
            r0.setVisibility(r3)
            if (r2 == 0) goto L_0x04df
            java.lang.String r0 = "EDIT_CROP_VIDEO_SHOW_WESEE_SWITCH_BOOLEAN"
            boolean r0 = r2.getBoolean(r0, r14)
            lh2.f0 r2 = r31.getPreviewPlugin()
            r2.f327329n = r13
            android.view.ViewGroup r3 = r2.mo160538a()
            if (r3 == 0) goto L_0x0386
            int r3 = r3.getWidth()
            goto L_0x0387
        L_0x0386:
            r3 = 0
        L_0x0387:
            android.view.ViewGroup r4 = r2.mo160538a()
            if (r4 == 0) goto L_0x0392
            int r4 = r4.getHeight()
            goto L_0x0393
        L_0x0392:
            r4 = 0
        L_0x0393:
            android.content.Context r5 = r2.f327325g
            r6 = 20
            int r5 = kg3.C76577a.m92151b(r5, r6)
            android.content.Context r6 = r2.f327325g
            r7 = 95
            int r6 = kg3.C76577a.m92151b(r6, r7)
            int r5 = r5 + r6
            android.content.Context r6 = r2.f327325g
            r7 = 12
            int r6 = kg3.C76577a.m92151b(r6, r7)
            int r5 = r5 + r6
            android.content.Context r6 = r2.f327325g
            boolean r6 = com.tencent.p014mm.p136ui.C75044y4.m89992d(r6)
            if (r6 == 0) goto L_0x03bc
            android.content.Context r6 = r2.f327325g
            int r6 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r6)
            int r5 = r5 + r6
        L_0x03bc:
            java.lang.String r6 = "MicroMsg.EditVideoPlayPlugin"
            if (r0 == 0) goto L_0x0401
            android.content.Context r7 = r2.f327325g
            r8 = 56
            int r7 = kg3.C76577a.m92151b(r7, r8)
            int r7 = r7 + r14
            android.content.Context r8 = r2.f327325g
            boolean r8 = com.tencent.p014mm.p136ui.C85875k4.m106205t(r8, r14)
            if (r8 == 0) goto L_0x03fb
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "hasCutOut is true，videoViewTopMargin: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r9 = ", cutout height is "
            r8.append(r9)
            android.content.Context r9 = r2.f327325g
            int r9 = com.tencent.p014mm.p136ui.C85875k4.m106198o(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r8)
            android.content.Context r8 = r2.f327325g
            int r8 = com.tencent.p014mm.p136ui.C85875k4.m106198o(r8)
            int r7 = r7 + r8
            goto L_0x0402
        L_0x03fb:
            java.lang.String r8 = "hasCutOut is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r8)
            goto L_0x0402
        L_0x0401:
            r7 = 0
        L_0x0402:
            int r8 = r4 - r5
            int r8 = r8 - r7
            android.view.ViewGroup r9 = r2.mo160538a()
            if (r9 == 0) goto L_0x0410
            int r9 = r9.getBottom()
            goto L_0x0412
        L_0x0410:
            int r9 = r5 + 0
        L_0x0412:
            android.content.Context r10 = r2.f327325g
            android.graphics.Point r10 = f72.C97842b.m126290g(r10)
            int r10 = r10.y
            if (r9 >= r10) goto L_0x042f
            android.content.Context r8 = r2.f327325g
            r9 = 32
            int r8 = kg3.C76577a.m92151b(r8, r9)
            r9 = 2
            int r8 = r8 * 2
            int r8 = r3 - r8
            float r8 = (float) r8
            float r9 = (float) r3
            float r10 = (float) r4
            float r9 = r9 / r10
            float r8 = r8 / r9
            int r8 = (int) r8
        L_0x042f:
            float r9 = (float) r3
            float r10 = (float) r4
            float r11 = r9 / r10
            float r12 = (float) r8
            float r11 = r11 * r12
            int r11 = (int) r11
            float r13 = (float) r11
            float r13 = r13 / r9
            float r12 = r12 / r10
            int r9 = r5 - r7
            int r9 = java.lang.Math.abs(r9)
            float r9 = (float) r9
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            float r9 = -r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "scaleX: "
            r10.append(r15)
            r10.append(r13)
            java.lang.String r15 = ", scaleY: "
            r10.append(r15)
            r10.append(r12)
            java.lang.String r15 = ", translationY: "
            r10.append(r15)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "isShowWeseeBtn: "
            r10.append(r15)
            r10.append(r0)
            java.lang.String r0 = ", videoViewWidth: "
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = ", videoViewHeight: "
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = ", videoViewBottomMargin:"
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = ", videoViewTopMargin:"
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = ", videoViewScaleHeight: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = ", videoViewScaleWidth: "
            r10.append(r0)
            r10.append(r11)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            android.view.ViewGroup r0 = r2.mo160538a()
            if (r0 == 0) goto L_0x04dd
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L_0x04dd
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r13)
            if (r0 == 0) goto L_0x04dd
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r12)
            if (r0 == 0) goto L_0x04dd
            android.view.ViewPropertyAnimator r0 = r0.translationY(r9)
            if (r0 == 0) goto L_0x04dd
            r3 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            if (r0 == 0) goto L_0x04dd
            lh2.d0 r3 = new lh2.d0
            r3.<init>(r2)
            r0.setListener(r3)
        L_0x04dd:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x04df:
            lh2.n r0 = r1.f272959n
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            r0.setEnableTouch(r14)
            th2.d r0 = th2.C110992d.f332425a
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "KEY_ENTER_CROP_PAGE_TIME_MS_LONG"
            r0.mo162677k(r3, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x04f9:
            if (r2 == 0) goto L_0x0574
            java.lang.String r0 = "EDIT_SELECT_MUSIC_LYRICS_BOOLEAN"
            boolean r3 = r2.getBoolean(r0)
            java.lang.String r0 = "EDIT_SELECT_MUSIC_LYRICS_LIST"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo r0 = (com.tencent.p014mm.plugin.recordvideo.model.audio.LyricsInfo) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r0 == 0) goto L_0x0540
            java.util.ArrayList<byte[]> r0 = r0.f315278d
            java.util.Iterator r4 = r0.iterator()
        L_0x0516:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r4.next()
            byte[] r0 = (byte[]) r0
            te3.cs2 r5 = new te3.cs2
            r5.<init>()
            if (r0 != 0) goto L_0x052a
            goto L_0x053a
        L_0x052a:
            r5.parseFrom(r0)     // Catch:{ Exception -> 0x052e }
            goto L_0x053a
        L_0x052e:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r14] = r6
            java.lang.String r6 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r9, r0)
        L_0x053a:
            r2.add(r5)
            goto L_0x0516
        L_0x053e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0540:
            lh2.n r0 = r1.f272959n
            r0.getClass()
            if (r3 == 0) goto L_0x0565
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            ai2.o r3 = r0.f273049B
            if (r3 == 0) goto L_0x054e
            goto L_0x054f
        L_0x054e:
            r13 = 0
        L_0x054f:
            if (r13 == 0) goto L_0x0561
            if (r3 != 0) goto L_0x0554
            goto L_0x0572
        L_0x0554:
            if (r3 == 0) goto L_0x055b
            android.view.ViewGroup r4 = r0.f273059j
            r4.removeView(r3)
        L_0x055b:
            r0.f273049B = r15
            r0.mo129900f(r2)
            goto L_0x0572
        L_0x0561:
            r0.mo129900f(r2)
            goto L_0x0572
        L_0x0565:
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            ai2.o r2 = r0.f273049B
            if (r2 == 0) goto L_0x0570
            android.view.ViewGroup r3 = r0.f273059j
            r3.removeView(r2)
        L_0x0570:
            r0.f273049B = r15
        L_0x0572:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0574:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x0578:
            if (r2 == 0) goto L_0x082d
            java.lang.String r0 = "PARAM_DELETE_VIEW_TYPE_INT"
            int r0 = r2.getInt(r0)
            r2 = 4
            if (r0 != r2) goto L_0x058a
            ph2.a r0 = r1.f272964s
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r0 = r0.f329708h
            r0.mo151412x(r14)
        L_0x058a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x058e:
            ph2.a r0 = r1.f272964s
            h90.b r3 = r1.f272954C
            gy3.C87412m.m108591d(r3)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r1.f272953B
            r0.getClass()
            java.lang.Class<h81.h> r5 = h81.C32735h.class
            jh2.d r6 = new jh2.d
            r6.<init>()
            jh2.C108745d.f325633i = r6
            fh2.d r6 = new fh2.d
            r6.<init>()
            r0.f329711n = r6
            java.util.ArrayList<java.lang.String> r6 = r3.f288190k
            if (r6 == 0) goto L_0x05b7
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x05b5
            goto L_0x05b7
        L_0x05b5:
            r6 = 0
            goto L_0x05b8
        L_0x05b7:
            r6 = 1
        L_0x05b8:
            r6 = r6 ^ r13
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "editorConfig : "
            r7.append(r8)
            fh2.d r8 = r0.f329711n
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.EditAddMusicPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            int r7 = r3.f288184e
            long r7 = (long) r7
            if (r4 == 0) goto L_0x05dc
            int r9 = r4.f272905F
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
        L_0x05dc:
            if (r15 != 0) goto L_0x05df
            goto L_0x0606
        L_0x05df:
            int r9 = r15.intValue()
            r10 = 2
            if (r9 != r10) goto L_0x0606
            fh2.d r4 = r0.f329711n
            fh2.l r9 = fh2.C107543l.SNSComm
            r4.getClass()
            r4.f321753f = r9
            fh2.d r4 = r0.f329711n
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_video_editor_lyrics_enable
            int r5 = r5.mo58779Qe(r9, r13)
            if (r5 != r13) goto L_0x0601
            r5 = 1
            goto L_0x0602
        L_0x0601:
            r5 = 0
        L_0x0602:
            r4.f321749b = r5
            goto L_0x069b
        L_0x0606:
            if (r15 != 0) goto L_0x0609
            goto L_0x062f
        L_0x0609:
            int r9 = r15.intValue()
            if (r9 != r13) goto L_0x062f
            fh2.d r4 = r0.f329711n
            fh2.l r9 = fh2.C107543l.Chatting
            r4.getClass()
            r4.f321753f = r9
            fh2.d r4 = r0.f329711n
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_video_editor_lyrics_enable_c2c
            int r5 = r5.mo58779Qe(r9, r14)
            if (r5 != r13) goto L_0x062a
            r5 = 1
            goto L_0x062b
        L_0x062a:
            r5 = 0
        L_0x062b:
            r4.f321749b = r5
            goto L_0x069b
        L_0x062f:
            r9 = 3
            if (r15 != 0) goto L_0x0633
            goto L_0x0657
        L_0x0633:
            int r10 = r15.intValue()
            if (r10 != r9) goto L_0x0657
            fh2.d r4 = r0.f329711n
            fh2.l r9 = fh2.C107543l.StoryComm
            r4.getClass()
            r4.f321753f = r9
            fh2.d r4 = r0.f329711n
            r4.f321749b = r13
            r4.f321748a = r6
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_story_visitor_enable
            boolean r5 = r5.mo58784wf(r9, r14)
            r4.f321752e = r5
            goto L_0x069b
        L_0x0657:
            r5 = 5
            if (r15 != 0) goto L_0x065b
            goto L_0x066b
        L_0x065b:
            int r9 = r15.intValue()
            if (r9 != r5) goto L_0x066b
            fh2.d r4 = r0.f329711n
            fh2.l r5 = fh2.C107543l.WXGGame
            r4.getClass()
            r4.f321753f = r5
            goto L_0x069b
        L_0x066b:
            r5 = 11
            if (r15 != 0) goto L_0x0670
            goto L_0x069b
        L_0x0670:
            int r9 = r15.intValue()
            if (r9 != r5) goto L_0x069b
            fh2.d r5 = r0.f329711n
            fh2.l r9 = fh2.C107543l.Finder
            r5.getClass()
            r5.f321753f = r9
            fh2.d r5 = r0.f329711n
            r5.f321749b = r14
            android.os.Bundle r9 = r3.f288193n
            if (r9 == 0) goto L_0x068e
            java.lang.String r10 = "SELECT_MUTE_ORIGIN_KEY"
            boolean r9 = r9.getBoolean(r10, r14)
            goto L_0x068f
        L_0x068e:
            r9 = 0
        L_0x068f:
            r5.f321750c = r9
            int r5 = r3.f288184e
            int r4 = r4.f272935w
            if (r5 <= r4) goto L_0x069b
            long r4 = (long) r4
            r24 = r4
            goto L_0x069d
        L_0x069b:
            r24 = r7
        L_0x069d:
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r4 = r0.f329708h
            r4.setPlayMusicWhenSearchFinish(r13)
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r4 = r0.f329708h
            java.lang.String r5 = r3.f288180a
            java.util.ArrayList<java.lang.String> r7 = r3.f288190k
            int r3 = r3.f288183d
            long r8 = (long) r3
            fh2.d r0 = r0.f329711n
            r28 = 0
            r29 = 64
            r30 = 0
            r19 = r4
            r20 = r5
            r21 = r7
            r22 = r8
            r26 = r6
            r27 = r0
            com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView.m142569v(r19, r20, r21, r22, r24, r26, r27, r28, r29, r30)
            lh2.n r0 = r1.f272959n
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            r0.setVisibility(r14)
            lh2.c0 r0 = r1.f272960o
            r0.setVisibility(r14)
            if (r2 == 0) goto L_0x06d9
            java.lang.String r0 = "PARAM_VIDEO_NEED_CROP"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != 0) goto L_0x06d9
            goto L_0x06da
        L_0x06d9:
            r13 = 0
        L_0x06da:
            if (r13 == 0) goto L_0x06e1
            ph2.a r0 = r1.f272964s
            r0.mo161619b()
        L_0x06e1:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x06e5:
            lh2.n r0 = r1.f272959n
            if (r2 == 0) goto L_0x06f2
            java.lang.String r3 = "PARAM_EDIT_EMOJI_INFO"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            com.tencent.mm.api.IEmojiInfo r2 = (com.tencent.p014mm.api.IEmojiInfo) r2
            goto L_0x06f3
        L_0x06f2:
            r2 = r15
        L_0x06f3:
            if (r2 == 0) goto L_0x0766
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            r0.getClass()
            ai2.g r3 = new ai2.g
            android.content.Context r4 = r0.getContext()
            java.lang.String r5 = "context"
            gy3.C87412m.m108593f(r4, r5)
            r3.<init>(r4)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r0.f273067u
            r5 = 0
            if (r4 == 0) goto L_0x072c
            com.tencent.mm.component.api.jumper.UICustomParam r4 = r4.f272927o
            if (r4 == 0) goto L_0x072c
            float r6 = r4.f266571d
            float r4 = r4.f266572e
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x071b
            r7 = 1
            goto L_0x071c
        L_0x071b:
            r7 = 0
        L_0x071c:
            if (r7 != 0) goto L_0x072c
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0723
            r14 = 1
        L_0x0723:
            if (r14 != 0) goto L_0x072c
            fi2.b r7 = r3.f263449s
            android.graphics.Matrix r7 = r7.f321806g
            r7.setScale(r6, r4)
        L_0x072c:
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r9, r9)
            android.view.ViewGroup r6 = r0.f273059j
            r6.addView(r3, r4)
            android.graphics.Rect r4 = zg2.C103020m.f303987c
            int r6 = zg2.C103020m.f303990f
            r3.mo53782m(r4, r6)
            android.graphics.Rect r4 = zg2.C103020m.f303988d
            r3.setValidArea(r4)
            android.graphics.Rect r4 = r0.f273058i
            r6 = 2
            gi2.C107818f.C107819a.m146077a(r3, r4, r5, r6, r15)
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer$c r4 = r0.f273057J
            r3.setStateResolve(r4)
            r3.setEmojiInfo(r2)
            r3.resume()
            r0.mo129912h(r3, r13)
            java.lang.Runnable r2 = r0.f273072z
            r0.removeCallbacks(r2)
            java.lang.Runnable r2 = r0.f273072z
            r3 = 1500(0x5dc, double:7.41E-321)
            r0.postDelayed(r2, r3)
            r0.mo129901g()
            goto L_0x0769
        L_0x0766:
            r0.getClass()
        L_0x0769:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x076d:
            if (r2 == 0) goto L_0x0804
            java.lang.CharSequence r17 = r2.getCharSequence(r12)
            int r18 = r2.getInt(r11)
            int r19 = r2.getInt(r10)
            java.lang.String r0 = "PARAM_EDIT_TEXT_FONT"
            java.lang.String r20 = r2.getString(r0)
            lh2.n r0 = r1.f272959n
            ai2.s r2 = new ai2.s
            gy3.C87412m.m108591d(r20)
            r21 = 0
            r22 = 0
            r23 = 48
            r24 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.getClass()
            ai2.t r3 = r0.f291594f
            if (r3 == 0) goto L_0x07a9
            r3.setVisibility(r14)
            ai2.t r3 = r0.f291594f
            if (r3 == 0) goto L_0x07a6
            r3.setText(r2)
        L_0x07a6:
            r0.f291594f = r15
            goto L_0x0802
        L_0x07a9:
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer r0 = r0.f291592d
            r0.getClass()
            ai2.t r3 = new ai2.t
            android.content.Context r4 = r0.getContext()
            r3.<init>(r4)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r0.f273067u
            if (r4 == 0) goto L_0x07c6
            com.tencent.mm.component.api.jumper.UICustomParam r4 = r4.f272927o
            if (r4 == 0) goto L_0x07c6
            float r5 = r4.f266573f
            float r4 = r4.f266574g
            r3.mo126003j(r5, r4)
        L_0x07c6:
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r9, r9)
            android.view.ViewGroup r5 = r0.f273059j
            r5.addView(r3, r4)
            android.graphics.Rect r4 = zg2.C103020m.f303987c
            int r5 = zg2.C103020m.f303990f
            r3.mo53782m(r4, r5)
            android.graphics.Rect r4 = zg2.C103020m.f303988d
            r3.setValidArea(r4)
            android.graphics.Rect r4 = r0.f273058i
            float r5 = r0.f273055H
            r3.mo53773f(r4, r5)
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer$c r4 = r0.f273057J
            r3.setStateResolve(r4)
            r3.setText(r2)
            android.view.View$OnClickListener r2 = r0.f273052E
            r3.setOnClickListener(r2)
            r0.mo129912h(r3, r13)
            java.lang.Runnable r2 = r0.f273072z
            r0.removeCallbacks(r2)
            java.lang.Runnable r2 = r0.f273072z
            r3 = 1500(0x5dc, double:7.41E-321)
            r0.postDelayed(r2, r3)
            r0.mo129901g()
        L_0x0802:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0804:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x0807:
            lh2.b0 r0 = r1.f272970y
            android.widget.ImageView r0 = r0.f291494d
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131100166(0x7f060206, float:1.7812706E38)
            int r2 = r2.getColor(r3)
            r0.setBackgroundColor(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x082d
        L_0x0820:
            th2.f r0 = th2.C101891f.f300035a
            r2 = 3
            r4 = 2
            r0.mo141375i(r4, r2)
            r31.mo78564e()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x082d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout.mo14585p(qh2.e$b, android.os.Bundle):void");
    }

    public final void setCaptureInfo(C98324b bVar) {
        this.f272954C = bVar;
    }

    public final void setConfigProvider(RecordConfigProvider recordConfigProvider) {
        this.f272953B = recordConfigProvider;
    }

    public final void setNavigator(C102440a aVar) {
        this.f272956h = aVar;
    }

    public final void setPreviewPlugin(C109339f0 f0Var) {
        C87412m.m108594g(f0Var, "<set-?>");
        this.f272957i = f0Var;
    }
}
