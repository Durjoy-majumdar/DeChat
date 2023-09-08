package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorInputView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import h90.C98324b;
import i21.C60242i;
import k21.C60960c;
import kotlin.Metadata;
import lh2.C109344g0;
import lh2.C109348i;
import lh2.C109359m;
import lh2.C109370r;
import lh2.C109376w;
import lh2.C109380y;
import lh2.C99426e;
import lh2.C99447k;
import lh2.C99448l;
import lh2.C99472x;
import oh2.C110039a;
import qh2.C101198e;
import th2.C110992d;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010F\u001a\u00020E\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bI\u0010JJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0004X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0004X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0004X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0004X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0004X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00108\u001a\u0002038\u0004X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0004X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010D\u001a\u00020?8\u0004X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006K"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lqh2/e;", "", "getLayoutId", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "i", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "getConfigProvider", "()Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "setConfigProvider", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "configProvider", "Lh90/b;", "j", "Lh90/b;", "getCaptureInfo", "()Lh90/b;", "setCaptureInfo", "(Lh90/b;)V", "captureInfo", "Llh2/y;", "n", "Llh2/y;", "getEditPencilPlugin", "()Llh2/y;", "editPencilPlugin", "Llh2/x;", "p", "Llh2/x;", "getEditCropPhotoPlugin", "()Llh2/x;", "editCropPhotoPlugin", "Llh2/r;", "q", "Llh2/r;", "getEditPhotoWrapper", "()Llh2/r;", "editPhotoWrapper", "Llh2/k;", "r", "Llh2/k;", "getBackToRecordPlugin", "()Llh2/k;", "backToRecordPlugin", "Llh2/w;", "s", "Llh2/w;", "getPhotoControlUI", "()Llh2/w;", "photoControlUI", "Llh2/e;", "t", "Llh2/e;", "getAddEmojiPlugin", "()Llh2/e;", "addEmojiPlugin", "Llh2/l;", "u", "Llh2/l;", "getEditFinishPlugin", "()Llh2/l;", "editFinishPlugin", "Llh2/i;", "v", "Llh2/i;", "getEditAddTextPlugin", "()Llh2/i;", "editAddTextPlugin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout */
public class EditPhotoPluginLayout extends BasePluginLayout implements C101198e {

    /* renamed from: h */
    public C102440a f315340h;

    /* renamed from: i */
    public RecordConfigProvider f315341i;

    /* renamed from: j */
    public C98324b f315342j;

    /* renamed from: n */
    public final C109380y f315343n;

    /* renamed from: o */
    public final C110039a f315344o;

    /* renamed from: p */
    public final C99472x f315345p;

    /* renamed from: q */
    public final C109370r f315346q;

    /* renamed from: r */
    public final C99447k f315347r;

    /* renamed from: s */
    public final C109376w f315348s;

    /* renamed from: t */
    public final C99426e f315349t;

    /* renamed from: u */
    public final C99448l f315350u;

    /* renamed from: v */
    public final C109348i f315351v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View.inflate(context, getLayoutId(), this);
        View findViewById = findViewById(C0966R.C0970id.azh);
        C87412m.m108593f(findViewById, "findViewById(R.id.change_text_root)");
        C109359m mVar = new C109359m((EditorInputView) findViewById, this);
        View findViewById2 = findViewById(C0966R.C0970id.cc8);
        C87412m.m108593f(findViewById2, "findViewById(R.id.editor_close)");
        C99447k kVar = new C99447k((ImageView) findViewById2, this);
        this.f315347r = kVar;
        C109380y yVar = new C109380y(this, this);
        this.f315343n = yVar;
        C110039a aVar = new C110039a(this, this);
        this.f315344o = aVar;
        View findViewById3 = findViewById(C0966R.C0970id.cbs);
        C87412m.m108593f(findViewById3, "findViewById(R.id.editor_add_emoji)");
        C99426e eVar = new C99426e(this, (ImageView) findViewById3, this);
        this.f315349t = eVar;
        C109348i iVar = new C109348i(this, this, mVar.f327377f);
        this.f315351v = iVar;
        View findViewById4 = findViewById(C0966R.C0970id.ccs);
        C87412m.m108593f(findViewById4, "findViewById(R.id.editor_photo_crop)");
        C99472x xVar = new C99472x((ImageView) findViewById4, this);
        this.f315345p = xVar;
        View findViewById5 = findViewById(C0966R.C0970id.cco);
        C87412m.m108593f(findViewById5, "findViewById(R.id.editor_mix)");
        C99448l lVar = new C99448l(findViewById5, this);
        this.f315350u = lVar;
        View findViewById6 = findViewById(C0966R.C0970id.f358925hw2);
        C87412m.m108593f(findViewById6, "findViewById(R.id.photo_preview_plugin)");
        C109370r rVar = new C109370r((FrameLayout) findViewById6, this);
        this.f315346q = rVar;
        View findViewById7 = findViewById(C0966R.C0970id.bsv);
        C87412m.m108593f(findViewById7, "findViewById(R.id.control_container)");
        C109376w wVar = new C109376w((ViewGroup) findViewById7, this);
        this.f315348s = wVar;
        View findViewById8 = findViewById(C0966R.C0970id.jfd);
        C87412m.m108593f(findViewById8, "findViewById(R.id.shadow_bg)");
        Log.m105924i("MicroMsg.EditPhotoShadowPlugin", "status bar : " + C75044y4.m89991c(findViewById8.getContext()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, findViewById8.getLayoutParams().height + C75044y4.m89991c(findViewById8.getContext()));
        layoutParams.addRule(12, -1);
        findViewById8.setLayoutParams(layoutParams);
        findViewById8.invalidate();
        eVar.setVisibility(0);
        iVar.setVisibility(0);
        yVar.f327450h.setVisibility(0);
        getPluginList().add(wVar);
        getPluginList().add(yVar);
        getPluginList().add(aVar);
        getPluginList().add(xVar);
        getPluginList().add(rVar);
        getPluginList().add(kVar);
        getPluginList().add(eVar);
        getPluginList().add(lVar);
        getPluginList().add(iVar);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (super.mo78564e()) {
            return true;
        }
        C115669n.INSTANCE.idkeyStat(985, 124, 1, false);
        C110992d dVar = C110992d.f332425a;
        dVar.mo162677k("KEY_AFTER_EDIT_INT", 0);
        dVar.mo162672f();
        C102440a aVar = this.f315340h;
        if (aVar == null) {
            return true;
        }
        C102440a.C102441a.m135179a(aVar, 0, (C98324b) null, 2, (Object) null);
        return true;
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    public final C99426e getAddEmojiPlugin() {
        return this.f315349t;
    }

    public final C99447k getBackToRecordPlugin() {
        return this.f315347r;
    }

    public final C98324b getCaptureInfo() {
        return this.f315342j;
    }

    public final RecordConfigProvider getConfigProvider() {
        return this.f315341i;
    }

    public final C109348i getEditAddTextPlugin() {
        return this.f315351v;
    }

    public final C99472x getEditCropPhotoPlugin() {
        return this.f315345p;
    }

    public final C99448l getEditFinishPlugin() {
        return this.f315350u;
    }

    public final C109380y getEditPencilPlugin() {
        return this.f315343n;
    }

    public final C109370r getEditPhotoWrapper() {
        return this.f315346q;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bmw;
    }

    public final C109376w getPhotoControlUI() {
        return this.f315348s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
        r8 = r8.f272912M;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0035 A[SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo128671k(wg2.C102440a r8, com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r9) {
        /*
            r7 = this;
            java.lang.String r0 = "navigator"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "configProvider"
            gy3.C87412m.m108594g(r9, r0)
            super.mo128671k(r8, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "configProvider "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.EditPhotoPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r7.f315340h = r8
            r7.f315341i = r9
            hi2.h r8 = hi2.C98453h.f288774a
            r8.mo137805c(r9)
            java.util.ArrayList r8 = r7.getPluginList()
            java.util.Iterator r8 = r8.iterator()
        L_0x0035:
            boolean r0 = r8.hasNext()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r8.next()
            lh2.g0 r0 = (lh2.C109344g0) r0
            com.tencent.mm.component.api.jumper.UICustomParam r4 = r9.f272927o
            if (r4 == 0) goto L_0x0064
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = r4.f266575h
            if (r4 == 0) goto L_0x0064
            hi2.w r5 = hi2.C108249w.f324119a
            java.lang.String r6 = r0.name()
            java.lang.String r5 = r5.mo158634a(r6)
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x0064
            boolean r4 = r4.booleanValue()
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r3 = 8
        L_0x006b:
            r0.setVisibility(r3)
            boolean r0 = r0 instanceof oh2.C110039a
            if (r0 == 0) goto L_0x0035
            if (r3 != 0) goto L_0x0035
            lh2.y r0 = r7.f315343n
            com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin r0 = r0.f327449g
            r2 = 0
            r0.mo151180a(r2, r2)
            android.widget.GridView r0 = r0.f315282g
            if (r0 == 0) goto L_0x0035
            r0.deferNotifyDataSetChanged()
            goto L_0x0035
        L_0x0084:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r8 = r7.f315341i
            if (r8 == 0) goto L_0x0093
            android.os.Bundle r8 = r8.f272912M
            if (r8 == 0) goto L_0x0093
            java.lang.String r9 = "button_custom_color"
            int r8 = r8.getInt(r9, r3)
            goto L_0x0094
        L_0x0093:
            r8 = 0
        L_0x0094:
            android.content.Context r9 = r7.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r0 = 2131101379(0x7f0606c3, float:1.7815166E38)
            int r9 = r9.getColor(r0)
            if (r8 != r9) goto L_0x00af
            lh2.w r8 = r7.f315348s
            android.widget.Button r8 = r8.f327433i
            r9 = 2131231397(0x7f0802a5, float:1.8078874E38)
            r8.setBackgroundResource(r9)
        L_0x00af:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r8 = r7.f315341i
            if (r8 == 0) goto L_0x00be
            android.os.Bundle r8 = r8.f272912M
            if (r8 == 0) goto L_0x00be
            java.lang.String r9 = "key_edit_enable_emoji_search"
            boolean r8 = r8.getBoolean(r9, r3)
            goto L_0x00bf
        L_0x00be:
            r8 = 0
        L_0x00bf:
            java.lang.Class<s00.f> r9 = s00.C90110f.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            s00.f r9 = (s00.C90110f) r9
            boolean r9 = r9.a60()
            if (r8 == 0) goto L_0x00d0
            if (r9 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r2 = 0
        L_0x00d1:
            if (r2 == 0) goto L_0x00d8
            lh2.e r0 = r7.f315349t
            r0.mo138865x()
        L_0x00d8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "checkShowEmojiSearch: needShow=["
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = "], isXWebKernelAvailable:["
            r0.append(r8)
            r0.append(r9)
            r8 = 93
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout.mo128671k(wg2.a, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    /* JADX WARNING: type inference failed for: r2v30, types: [eq3.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c0  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129855l(h90.C98324b r12) {
        /*
            r11 = this;
            super.mo129855l(r12)
            if (r12 == 0) goto L_0x01df
            r11.f315342j = r12
            lh2.r r0 = r11.f315346q
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r11.f315341i
            gy3.C87412m.m108591d(r1)
            r0.getClass()
            r0.f327412i = r1
            r0.f327413j = r12
            lh2.r r0 = r11.f315346q
            java.lang.String r1 = r12.f288189j
            r0.getClass()
            java.lang.String r2 = "path"
            gy3.C87412m.m108594g(r1, r2)
            android.widget.FrameLayout r2 = r0.f327407d
            r3 = 0
            r2.setVisibility(r3)
            h90.b r2 = r0.f327413j
            r4 = 1
            if (r2 == 0) goto L_0x0033
            boolean r2 = r2.f288192m
            if (r2 != r4) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x0046
            rx3.g r2 = r0.f327410g
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.String r5 = "<get-mLandscapePhotoEditor>(...)"
            gy3.C87412m.m108593f(r2, r5)
            ug.r0 r2 = (p248ug.C111164r0) r2
            goto L_0x0055
        L_0x0046:
            rx3.g r2 = r0.f327409f
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.String r5 = "<get-mPortraitPhotoEditor>(...)"
            gy3.C87412m.m108593f(r2, r5)
            ug.r0 r2 = (p248ug.C111164r0) r2
        L_0x0055:
            r0.f327411h = r2
            ug.r0$a r5 = new ug.r0$a
            r5.<init>()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6 = r0.f327412i
            if (r6 == 0) goto L_0x0068
            int r7 = r6.f272905F
            r8 = 291(0x123, float:4.08E-43)
            if (r7 != r8) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = 0
        L_0x0069:
            if (r7 != 0) goto L_0x0087
            if (r6 == 0) goto L_0x0075
            int r7 = r6.f272905F
            r8 = 293(0x125, float:4.1E-43)
            if (r7 != r8) goto L_0x0075
            r7 = 1
            goto L_0x0076
        L_0x0075:
            r7 = 0
        L_0x0076:
            if (r7 != 0) goto L_0x0087
            if (r6 == 0) goto L_0x0082
            int r6 = r6.f272905F
            r7 = 294(0x126, float:4.12E-43)
            if (r6 != r7) goto L_0x0082
            r6 = 1
            goto L_0x0083
        L_0x0082:
            r6 = 0
        L_0x0083:
            if (r6 != 0) goto L_0x0087
            r6 = 1
            goto L_0x0088
        L_0x0087:
            r6 = 0
        L_0x0088:
            r5.f332925b = r6
            r5.f332926c = r3
            android.graphics.Rect r6 = new android.graphics.Rect
            android.widget.FrameLayout r7 = r0.f327407d
            int r7 = r7.getLeft()
            android.widget.FrameLayout r8 = r0.f327407d
            int r8 = r8.getTop()
            android.widget.FrameLayout r9 = r0.f327407d
            int r9 = r9.getRight()
            android.widget.FrameLayout r10 = r0.f327407d
            int r10 = r10.getBottom()
            r6.<init>(r7, r8, r9, r10)
            r5.f332928e = r6
            ug.r0$b r6 = p248ug.C111164r0.C111166b.PHOTO
            r5.f332924a = r6
            h90.b r6 = r0.f327413j
            if (r6 == 0) goto L_0x00b9
            boolean r6 = r6.f288182c
            if (r6 != r4) goto L_0x00b9
            r6 = 1
            goto L_0x00ba
        L_0x00b9:
            r6 = 0
        L_0x00ba:
            r5.f332929f = r6
            r5.f332927d = r1
            int r6 = r0.f327421u
            r5.f332933j = r6
            float r6 = r0.f327422v
            r5.f332934k = r6
            r2.mo162895d(r5)
            ug.r0 r2 = r0.f327411h
            r5 = 0
            if (r2 == 0) goto L_0x00d5
            android.content.Context r6 = r0.f327416p
            ug.e r2 = r2.mo162894c(r6)
            goto L_0x00d6
        L_0x00d5:
            r2 = r5
        L_0x00d6:
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView"
            gy3.C87412m.m108592e(r2, r6)
            zp3.e0 r2 = (zp3.C112660e0) r2
            r0.f327414n = r2
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r0.f327412i
            if (r2 == 0) goto L_0x0106
            android.os.Bundle r2 = r2.f272912M
            if (r2 == 0) goto L_0x0106
            java.lang.String r7 = "matrix"
            float[] r2 = r2.getFloatArray(r7)
            if (r2 == 0) goto L_0x0106
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r7.setValues(r2)
            zp3.e0 r2 = r0.f327414n
            if (r2 == 0) goto L_0x0106
            cq3.a r2 = r2.getBaseBoardView()
            if (r2 == 0) goto L_0x0106
            r2.setForceMatrix(r7)
        L_0x0106:
            zp3.e0 r2 = r0.f327414n
            if (r2 == 0) goto L_0x0111
            eq3.a r2 = r2.getBaseFooterView()
            r5 = r2
            eq3.c r5 = (eq3.C107287c) r5
        L_0x0111:
            if (r5 != 0) goto L_0x0114
            goto L_0x0117
        L_0x0114:
            r5.setHideFooter(r4)
        L_0x0117:
            zp3.e0 r2 = r0.f327414n
            gy3.C87412m.m108592e(r2, r6)
            me3.f r2 = r2.getPresenter()
            r0.f327415o = r2
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter"
            gy3.C87412m.m108592e(r2, r5)
            me3.c r2 = (me3.C109612c) r2
            lh2.s r5 = new lh2.s
            r5.<init>(r0)
            r2.f328172o = r5
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r2.<init>(r5, r5)
            android.widget.FrameLayout r5 = r0.f327407d
            zp3.e0 r6 = r0.f327414n
            r5.addView(r6, r2)
            zp3.e0 r2 = r0.f327414n
            if (r2 != 0) goto L_0x0143
            goto L_0x014b
        L_0x0143:
            lh2.t r5 = new lh2.t
            r5.<init>(r0)
            r2.setSelectedFeatureListener(r5)
        L_0x014b:
            me3.f r2 = r0.f327415o
            if (r2 == 0) goto L_0x0162
            ug.t r5 = p248ug.C111167t.DOODLE
            me3.c r2 = (me3.C109612c) r2
            bh.b r2 = r2.mo160818b(r5)
            bh.j r2 = (p1093bh.C104100j) r2
            if (r2 == 0) goto L_0x0162
            lh2.u r5 = new lh2.u
            r5.<init>(r0)
            r2.f307896m = r5
        L_0x0162:
            me3.f r2 = r0.f327415o
            if (r2 == 0) goto L_0x0179
            ug.t r5 = p248ug.C111167t.MOSAIC
            me3.c r2 = (me3.C109612c) r2
            bh.b r2 = r2.mo160818b(r5)
            bh.p r2 = (p1093bh.C104107p) r2
            if (r2 == 0) goto L_0x0179
            lh2.v r5 = new lh2.v
            r5.<init>(r0)
            r2.f307896m = r5
        L_0x0179:
            android.graphics.BitmapFactory$Options r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r1)
            if (r0 == 0) goto L_0x0197
            th2.d r1 = th2.C110992d.f332425a
            int r2 = r0.outWidth
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r5 = "KEY_ORIGIN_MEDIA_WIDTH_INT"
            r1.mo162677k(r5, r2)
            int r0 = r0.outHeight
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "KEY_ORIGIN_MEDIA_HEIGHT_INT"
            r1.mo162677k(r2, r0)
        L_0x0197:
            th2.d r0 = th2.C110992d.f332425a
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "KEY_ENTER_EDIT_PAGE_TIME_MS_LONG"
            r0.mo162677k(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "KEY_EDIT_PUBLISHID_INT"
            r0.mo162677k(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r2 = "KEY_MEDIA_TYPE_INT"
            r0.mo162677k(r2, r1)
            boolean r12 = r12.f288182c
            if (r12 != 0) goto L_0x01d3
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r12 = r11.f315341i
            if (r12 == 0) goto L_0x01c7
            int r12 = r12.f272905F
            goto L_0x01c8
        L_0x01c7:
            r12 = 0
        L_0x01c8:
            if (r12 <= 0) goto L_0x01d3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "KEY_MEDIA_SOURCE_INT"
            r0.mo162677k(r1, r12)
        L_0x01d3:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 985(0x3d9, double:4.867E-321)
            r5 = 119(0x77, double:5.9E-322)
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout.mo129855l(h90.b):void");
    }

    public void onDetach() {
        super.onDetach();
        C60960c.f173618a.mo85927k("SnsPublishProcess", "mediaEditPageStaytime_", Long.valueOf(getBrowserTimeMs()), C60242i.APPEND);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14585p(qh2.C101198e.C101199b r23, android.os.Bundle r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            ug.t r3 = p248ug.C111167t.MOSAIC
            ug.t r4 = p248ug.C111167t.CROP_PHOTO
            ug.t r5 = p248ug.C111167t.TEXT
            java.lang.String r6 = "status"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "status :"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = " , param :"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.EditPhotoPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            int r1 = r23.ordinal()
            r6 = 29
            r7 = 2
            if (r1 == r6) goto L_0x0349
            r6 = 37
            java.lang.String r8 = "PARAM_EDIT_TEXT_COLOR_BG_INT"
            java.lang.String r9 = "PARAM_EDIT_TEXT_COLOR"
            java.lang.String r10 = "PARAM_EDIT_TEXT_CONTENT"
            r11 = 0
            if (r1 == r6) goto L_0x0303
            r6 = 42
            if (r1 == r6) goto L_0x02ed
            r6 = 62
            if (r1 == r6) goto L_0x02e7
            r6 = 86
            if (r1 == r6) goto L_0x0290
            r6 = 104(0x68, float:1.46E-43)
            if (r1 == r6) goto L_0x0266
            r6 = 32
            r8 = 4
            if (r1 == r6) goto L_0x025f
            r6 = 33
            if (r1 == r6) goto L_0x025f
            r6 = 48
            if (r1 == r6) goto L_0x025f
            r6 = 49
            r9 = 0
            if (r1 == r6) goto L_0x0258
            switch(r1) {
                case 67: goto L_0x00ad;
                case 68: goto L_0x008f;
                case 69: goto L_0x0073;
                default: goto L_0x006a;
            }
        L_0x006a:
            r5 = 1
            switch(r1) {
                case 71: goto L_0x01cb;
                case 72: goto L_0x01c4;
                case 73: goto L_0x01bd;
                case 74: goto L_0x01b1;
                case 75: goto L_0x0181;
                case 76: goto L_0x0151;
                case 77: goto L_0x011e;
                case 78: goto L_0x00e3;
                default: goto L_0x006e;
            }
        L_0x006e:
            switch(r1) {
                case 80: goto L_0x0233;
                case 81: goto L_0x0222;
                case 82: goto L_0x020e;
                case 83: goto L_0x01f9;
                case 84: goto L_0x01ed;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0353
        L_0x0073:
            lh2.k r1 = r0.f315347r
            r1.setVisibility(r8)
            lh2.w r1 = r0.f315348s
            r1.setVisibility(r8)
            lh2.r r1 = r0.f315346q
            me3.f r1 = r1.f327415o
            if (r1 == 0) goto L_0x0353
            me3.c r1 = (me3.C109612c) r1
            me3.a r2 = new me3.a
            r2.<init>(r1)
            r2.mo150361a(r5)
            goto L_0x0353
        L_0x008f:
            lh2.k r1 = r0.f315347r
            r1.setVisibility(r8)
            lh2.w r1 = r0.f315348s
            r1.setVisibility(r8)
            lh2.r r1 = r0.f315346q
            me3.f r1 = r1.f327415o
            if (r1 == 0) goto L_0x0353
            me3.c r1 = (me3.C109612c) r1
            me3.a r2 = new me3.a
            r2.<init>(r1)
            ug.t r1 = p248ug.C111167t.EMOJI
            r2.mo150361a(r1)
            goto L_0x0353
        L_0x00ad:
            lh2.y r1 = r0.f315343n
            com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin r1 = r1.f327449g
            r1.setVisibility(r8)
            lh2.k r1 = r0.f315347r
            r1.setVisibility(r8)
            lh2.w r1 = r0.f315348s
            lh2.w$a r2 = lh2.C109376w.C109377a.CROP_FUNC
            r1.f327436o = r2
            android.view.ViewGroup r2 = r1.f327430f
            r2.setVisibility(r8)
            android.view.ViewGroup r1 = r1.f327431g
            r1.setVisibility(r9)
            lh2.r r1 = r0.f315346q
            ug.t r2 = r1.f327419s
            if (r2 != r4) goto L_0x00d1
            goto L_0x0353
        L_0x00d1:
            r1.f327419s = r4
            me3.f r1 = r1.f327415o
            if (r1 == 0) goto L_0x0353
            me3.c r1 = (me3.C109612c) r1
            me3.a r2 = new me3.a
            r2.<init>(r1)
            r2.mo150361a(r4)
            goto L_0x0353
        L_0x00e3:
            lh2.r r1 = r0.f315346q
            me3.f r2 = r1.f327415o
            if (r2 == 0) goto L_0x00fa
            me3.c r2 = (me3.C109612c) r2
            me3.a r3 = new me3.a
            r3.<init>(r2)
            fi.c r2 = p520fi.C107546c.f321771c
            ug.t r2 = r2.mo157986a()
            r4 = -1
            r3.mo150363c(r2, r4, r11)
        L_0x00fa:
            me3.f r2 = r1.f327415o
            if (r2 == 0) goto L_0x010a
            me3.c r2 = (me3.C109612c) r2
            me3.a r3 = new me3.a
            r3.<init>(r2)
            ug.t r2 = r1.f327419s
            r3.mo150361a(r2)
        L_0x010a:
            me3.f r2 = r1.f327415o
            if (r2 == 0) goto L_0x0353
            me3.c r2 = (me3.C109612c) r2
            me3.a r3 = new me3.a
            r3.<init>(r2)
            ug.t r2 = r1.f327419s
            int r1 = r1.f327420t
            r3.mo150363c(r2, r1, r11)
            goto L_0x0353
        L_0x011e:
            oh2.a r1 = r0.f315344o
            r1.reset()
            if (r2 == 0) goto L_0x0353
            lh2.r r1 = r0.f315346q
            java.lang.String r3 = "EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT"
            int r2 = r2.getInt(r3)
            ug.t r3 = p248ug.C111167t.DOODLE
            r1.f327419s = r3
            r1.f327420t = r2
            me3.f r4 = r1.f327415o
            if (r4 == 0) goto L_0x0141
            me3.c r4 = (me3.C109612c) r4
            me3.a r5 = new me3.a
            r5.<init>(r4)
            r5.mo150361a(r3)
        L_0x0141:
            me3.f r1 = r1.f327415o
            if (r1 == 0) goto L_0x0353
            me3.c r1 = (me3.C109612c) r1
            me3.a r4 = new me3.a
            r4.<init>(r1)
            r4.mo150363c(r3, r2, r11)
            goto L_0x0353
        L_0x0151:
            lh2.r r1 = r0.f315346q
            r1.f327419s = r3
            r1.f327420t = r5
            me3.f r2 = r1.f327415o
            if (r2 == 0) goto L_0x0165
            me3.c r2 = (me3.C109612c) r2
            me3.a r4 = new me3.a
            r4.<init>(r2)
            r4.mo150361a(r3)
        L_0x0165:
            me3.f r1 = r1.f327415o
            if (r1 == 0) goto L_0x0173
            me3.c r1 = (me3.C109612c) r1
            me3.a r2 = new me3.a
            r2.<init>(r1)
            r2.mo150363c(r3, r5, r11)
        L_0x0173:
            th2.d r1 = th2.C110992d.f332425a
            java.lang.String r2 = "KEY_CLICK_BRUSH_COUNT_INT"
            th2.C110992d.m151314c(r1, r2, r9, r7, r11)
            r2 = 9
            r1.mo162669b(r2)
            goto L_0x0353
        L_0x0181:
            lh2.r r1 = r0.f315346q
            r1.f327419s = r3
            r1.f327420t = r9
            me3.f r2 = r1.f327415o
            if (r2 == 0) goto L_0x0195
            me3.c r2 = (me3.C109612c) r2
            me3.a r4 = new me3.a
            r4.<init>(r2)
            r4.mo150361a(r3)
        L_0x0195:
            me3.f r1 = r1.f327415o
            if (r1 == 0) goto L_0x01a3
            me3.c r1 = (me3.C109612c) r1
            me3.a r2 = new me3.a
            r2.<init>(r1)
            r2.mo150363c(r3, r9, r11)
        L_0x01a3:
            th2.d r1 = th2.C110992d.f332425a
            java.lang.String r2 = "KEY_CLICK_MOSAIC_COUNT_INT"
            th2.C110992d.m151314c(r1, r2, r9, r7, r11)
            r2 = 8
            r1.mo162669b(r2)
            goto L_0x0353
        L_0x01b1:
            lh2.w r1 = r0.f315348s
            r1.mo160571a()
            lh2.r r1 = r0.f315346q
            r1.reset()
            goto L_0x0353
        L_0x01bd:
            lh2.w r1 = r0.f315348s
            r1.setVisibility(r9)
            goto L_0x0353
        L_0x01c4:
            lh2.w r1 = r0.f315348s
            r1.setVisibility(r8)
            goto L_0x0353
        L_0x01cb:
            lh2.w r1 = r0.f315348s
            android.view.ViewGroup r1 = r1.f327428d
            int r1 = r1.getVisibility()
            if (r1 != r8) goto L_0x01dc
            lh2.w r1 = r0.f315348s
            r1.setVisibility(r9)
            goto L_0x0353
        L_0x01dc:
            lh2.w r1 = r0.f315348s
            android.view.ViewGroup r1 = r1.f327428d
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0353
            lh2.w r1 = r0.f315348s
            r1.setVisibility(r8)
            goto L_0x0353
        L_0x01ed:
            lh2.k r1 = r0.f315347r
            r1.setVisibility(r9)
            lh2.w r1 = r0.f315348s
            r1.setVisibility(r9)
            goto L_0x0353
        L_0x01f9:
            lh2.r r1 = r0.f315346q
            r1.f327419s = r4
            me3.f r1 = r1.f327415o
            if (r1 == 0) goto L_0x0353
            me3.c r1 = (me3.C109612c) r1
            me3.a r2 = new me3.a
            r2.<init>(r1)
            r1 = 3
            r2.mo150363c(r4, r1, r11)
            goto L_0x0353
        L_0x020e:
            lh2.r r1 = r0.f315346q
            r1.f327419s = r4
            me3.f r1 = r1.f327415o
            if (r1 == 0) goto L_0x0353
            me3.c r1 = (me3.C109612c) r1
            me3.a r2 = new me3.a
            r2.<init>(r1)
            r2.mo150363c(r4, r9, r11)
            goto L_0x0353
        L_0x0222:
            lh2.k r1 = r0.f315347r
            r1.setVisibility(r9)
            lh2.r r1 = r0.f315346q
            r1.mo160569b()
            lh2.y r1 = r0.f315343n
            r1.mo160579a()
            goto L_0x0353
        L_0x0233:
            lh2.k r1 = r0.f315347r
            r1.setVisibility(r9)
            lh2.w r1 = r0.f315348s
            r1.mo160571a()
            lh2.y r1 = r0.f315343n
            r1.mo160579a()
            lh2.r r1 = r0.f315346q
            ug.t r2 = p248ug.C111167t.DEFAULT
            r1.f327419s = r2
            me3.f r1 = r1.f327415o
            if (r1 == 0) goto L_0x0353
            me3.c r1 = (me3.C109612c) r1
            me3.a r2 = new me3.a
            r2.<init>(r1)
            r2.mo150363c(r4, r5, r11)
            goto L_0x0353
        L_0x0258:
            lh2.w r1 = r0.f315348s
            r1.setVisibility(r9)
            goto L_0x0353
        L_0x025f:
            lh2.w r1 = r0.f315348s
            r1.setVisibility(r8)
            goto L_0x0353
        L_0x0266:
            if (r2 == 0) goto L_0x0353
            java.lang.String r1 = "PARAM_EDIT_EMOJI_INFO"
            android.os.Parcelable r1 = r2.getParcelable(r1)
            com.tencent.mm.api.IEmojiInfo r1 = (com.tencent.p014mm.api.IEmojiInfo) r1
            if (r1 == 0) goto L_0x0353
            lh2.r r2 = r0.f315346q
            r2.getClass()
            me3.f r3 = r2.f327415o
            if (r3 == 0) goto L_0x0285
            me3.c r3 = (me3.C109612c) r3
            me3.a r4 = new me3.a
            r4.<init>(r3)
            r4.mo150361a(r5)
        L_0x0285:
            me3.f r2 = r2.f327415o
            if (r2 == 0) goto L_0x0353
            me3.c r2 = (me3.C109612c) r2
            r2.mo160830n(r1)
            goto L_0x0353
        L_0x0290:
            lh2.y r1 = r0.f315343n
            r1.reset()
            oh2.a r1 = r0.f315344o
            lh2.r r3 = r0.f315346q
            me3.f r3 = r3.f327415o
            if (r3 == 0) goto L_0x02a1
            me3.c r3 = (me3.C109612c) r3
            android.graphics.Bitmap r11 = r3.f328163f
        L_0x02a1:
            if (r11 == 0) goto L_0x02a9
            com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin r1 = r1.f329301g
            r1.setPreImage(r11)
            goto L_0x02ac
        L_0x02a9:
            r1.getClass()
        L_0x02ac:
            if (r2 == 0) goto L_0x0353
            lh2.r r1 = r0.f315346q
            java.lang.String r3 = "EDIT_FILTER_INDEX_INT"
            int r3 = r2.getInt(r3)
            java.lang.String r4 = "EDIT_FILTER_COLOR_WEIGHT_FLOAT"
            float r2 = r2.getFloat(r4)
            ug.t r4 = p248ug.C111167t.FILTER
            r1.f327419s = r4
            r1.f327420t = r3
            me3.f r3 = r1.f327415o
            if (r3 == 0) goto L_0x02d0
            me3.c r3 = (me3.C109612c) r3
            me3.a r5 = new me3.a
            r5.<init>(r3)
            r5.mo150361a(r4)
        L_0x02d0:
            me3.f r3 = r1.f327415o
            if (r3 == 0) goto L_0x0353
            me3.c r3 = (me3.C109612c) r3
            me3.a r4 = new me3.a
            r4.<init>(r3)
            ug.t r3 = r1.f327419s
            int r1 = r1.f327420t
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r4.mo150363c(r3, r1, r2)
            goto L_0x0353
        L_0x02e7:
            lh2.r r1 = r0.f315346q
            r1.mo160570c(r11)
            goto L_0x0353
        L_0x02ed:
            if (r2 == 0) goto L_0x0353
            java.lang.CharSequence r1 = r2.getCharSequence(r10)
            int r3 = r2.getInt(r9)
            int r2 = r2.getInt(r8)
            lh2.i r4 = r0.f315351v
            java.lang.String r5 = ""
            r4.mo160546x(r1, r3, r2, r5)
            goto L_0x0353
        L_0x0303:
            if (r2 == 0) goto L_0x0353
            java.lang.CharSequence r1 = r2.getCharSequence(r10)
            int r14 = r2.getInt(r9)
            int r15 = r2.getInt(r8)
            java.lang.String r3 = "PARAM_EDIT_TEXT_FONT"
            java.lang.String r16 = r2.getString(r3)
            lh2.r r2 = r0.f315346q
            if (r1 == 0) goto L_0x031f
            java.lang.String r11 = r1.toString()
        L_0x031f:
            r13 = r11
            gy3.C87412m.m108591d(r16)
            r2.getClass()
            me3.f r1 = r2.f327415o
            if (r1 == 0) goto L_0x0334
            me3.c r1 = (me3.C109612c) r1
            me3.a r3 = new me3.a
            r3.<init>(r1)
            r3.mo150361a(r5)
        L_0x0334:
            me3.f r1 = r2.f327415o
            if (r1 == 0) goto L_0x0353
            r12 = r1
            me3.c r12 = (me3.C109612c) r12
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 1
            r21 = 0
            r12.mo160831o(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0353
        L_0x0349:
            th2.f r1 = th2.C101891f.f300035a
            r2 = 3
            r1.mo141375i(r7, r2)
            r22.mo78564e()
        L_0x0353:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout.mo14585p(qh2.e$b, android.os.Bundle):void");
    }

    public final void setCaptureInfo(C98324b bVar) {
        this.f315342j = bVar;
    }

    public final void setConfigProvider(RecordConfigProvider recordConfigProvider) {
        this.f315341i = recordConfigProvider;
    }
}
