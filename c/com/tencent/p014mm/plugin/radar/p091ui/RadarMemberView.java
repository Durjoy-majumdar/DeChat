package com.tencent.p014mm.plugin.radar.p091ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.radar.model.RadarAddContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fg2.C45772g;
import fg2.C75751c0;
import fg2.C75753d;
import fg2.C75754e;
import fg2.C75755f;
import fg2.C75756h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p629ny.C76979h;
import qo3.C77398g;
import rx3.C13601g;
import te3.C64496km3;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001CB\u0019\b\u0016\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?B!\b\u0016\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\b>\u0010BJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\nR\u001b\u0010\u0018\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010#\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\"\u0010\u0017R\u001b\u0010&\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b%\u0010\u001cR\u001b\u0010)\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b(\u0010\u001cR$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006D"}, mo182094d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarMemberView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/radar/ui/RadarMemberView$a;", "listener", "Lrx3/b0;", "setListener", "Landroid/view/View;", "e", "Lrx3/g;", "getAvatarHolder", "()Landroid/view/View;", "avatarHolder", "Landroid/widget/ImageView;", "f", "getAvatarCopy", "()Landroid/widget/ImageView;", "avatarCopy", "g", "getAvatarCopyContainer", "avatarCopyContainer", "Landroid/widget/Button;", "h", "getConfirmBtn", "()Landroid/widget/Button;", "confirmBtn", "Landroid/widget/TextView;", "i", "getConfirmBtnDisabled", "()Landroid/widget/TextView;", "confirmBtnDisabled", "j", "getMemberNameTv", "memberNameTv", "n", "getModifyNameBtn", "modifyNameBtn", "o", "getSayHiTv", "sayHiTv", "q", "getExposeTv", "exposeTv", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$d;", "r", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$d;", "getState", "()Lcom/tencent/mm/plugin/radar/model/RadarAddContact$d;", "setState", "(Lcom/tencent/mm/plugin/radar/model/RadarAddContact$d;)V", "state", "Lte3/km3;", "s", "Lte3/km3;", "getMember", "()Lte3/km3;", "setMember", "(Lte3/km3;)V", "member", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarMemberView */
public final class RadarMemberView extends RelativeLayout {

    /* renamed from: C */
    public static final /* synthetic */ int f203296C = 0;

    /* renamed from: A */
    public EditText f203297A;

    /* renamed from: B */
    public TextView f203298B;

    /* renamed from: d */
    public View f203299d;

    /* renamed from: e */
    public final C13601g f203300e = C75751c0.m91019a(this, C0966R.C0970id.ibo);

    /* renamed from: f */
    public final C13601g f203301f = C75751c0.m91019a(this, C0966R.C0970id.ib_);

    /* renamed from: g */
    public final C13601g f203302g = C75751c0.m91019a(this, C0966R.C0970id.ib9);

    /* renamed from: h */
    public final C13601g f203303h = C75751c0.m91019a(this, C0966R.C0970id.ibc);

    /* renamed from: i */
    public final C13601g f203304i = C75751c0.m91019a(this, C0966R.C0970id.ibd);

    /* renamed from: j */
    public final C13601g f203305j = C75751c0.m91019a(this, C0966R.C0970id.ibi);

    /* renamed from: n */
    public final C13601g f203306n = C75751c0.m91019a(this, C0966R.C0970id.ibh);

    /* renamed from: o */
    public final C13601g f203307o = C75751c0.m91019a(this, C0966R.C0970id.ibu);

    /* renamed from: p */
    public int[] f203308p;

    /* renamed from: q */
    public final C13601g f203309q = C75751c0.m91019a(this, C0966R.C0970id.cn_);

    /* renamed from: r */
    public RadarAddContact.C70378d f203310r;

    /* renamed from: s */
    public C64496km3 f203311s;

    /* renamed from: t */
    public boolean f203312t;

    /* renamed from: u */
    public C72996z1 f203313u;

    /* renamed from: v */
    public C70382a f203314v;

    /* renamed from: w */
    public final View.OnClickListener f203315w = new C75756h(this);

    /* renamed from: x */
    public final C75753d f203316x = new C75753d(this);

    /* renamed from: y */
    public C77398g f203317y;

    /* renamed from: z */
    public View f203318z;

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarMemberView$a */
    public interface C70382a {
        /* renamed from: a */
        void mo96931a(C64496km3 km32, RadarAddContact.C70378d dVar);

        /* renamed from: b */
        void mo96932b(C64496km3 km32, RadarAddContact.C70378d dVar);
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarMemberView$b */
    public /* synthetic */ class C70383b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f203319a;

        static {
            int[] iArr = new int[RadarAddContact.C70378d.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            f203319a = iArr;
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarMemberView$c */
    public static final class C70384c implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ RadarMemberView f203320a;

        public C70384c(RadarMemberView radarMemberView) {
            this.f203320a = radarMemberView;
        }

        public void onAnimationEnd(Animation animation) {
            C87412m.m108594g(animation, "animation");
            int i = RadarMemberView.f203296C;
            Log.m105918d("MicroMsg.RadarMemberView", "dismiss animation end");
            RadarMemberView radarMemberView = this.f203320a;
            radarMemberView.f203312t = false;
            radarMemberView.f203316x.sendEmptyMessage(1);
        }

        public void onAnimationRepeat(Animation animation) {
            C87412m.m108594g(animation, "animation");
        }

        public void onAnimationStart(Animation animation) {
            C87412m.m108594g(animation, "animation");
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarMemberView$d */
    public static final class C70385d implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ RadarMemberView f203321a;

        public C70385d(RadarMemberView radarMemberView) {
            this.f203321a = radarMemberView;
        }

        public void onAnimationEnd(Animation animation) {
            C87412m.m108594g(animation, "animation");
            int i = RadarMemberView.f203296C;
            Log.m105918d("MicroMsg.RadarMemberView", "popup animation end");
            this.f203321a.f203316x.sendEmptyMessage(0);
        }

        public void onAnimationRepeat(Animation animation) {
            C87412m.m108594g(animation, "animation");
        }

        public void onAnimationStart(Animation animation) {
            C87412m.m108594g(animation, "animation");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarMemberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0097, code lost:
        if ((r6 == null || z04.C112551y.m153811k(r6)) != false) goto L_0x0099;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m82917a(com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView r10) {
        /*
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            android.widget.EditText r1 = r10.f203297A
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000a
            goto L_0x011e
        L_0x000a:
            r4 = 0
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            int r5 = r5 - r3
            r6 = 0
            r7 = 0
        L_0x001a:
            if (r6 > r5) goto L_0x003f
            if (r7 != 0) goto L_0x0020
            r8 = r6
            goto L_0x0021
        L_0x0020:
            r8 = r5
        L_0x0021:
            char r8 = r1.charAt(r8)
            r9 = 32
            int r8 = gy3.C87412m.m108596i(r8, r9)
            if (r8 > 0) goto L_0x002f
            r8 = 1
            goto L_0x0030
        L_0x002f:
            r8 = 0
        L_0x0030:
            if (r7 != 0) goto L_0x0039
            if (r8 != 0) goto L_0x0036
            r7 = 1
            goto L_0x001a
        L_0x0036:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0039:
            if (r8 != 0) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            int r5 = r5 + -1
            goto L_0x001a
        L_0x003f:
            int r5 = r5 + r3
            java.lang.CharSequence r1 = r1.subSequence(r6, r5)
            java.lang.String r1 = r1.toString()
            te3.km3 r5 = r10.f203311s
            if (r5 == 0) goto L_0x0054
            java.lang.String r6 = r5.f183957d
            if (r6 != 0) goto L_0x0056
            java.lang.String r6 = r5.f183961h
            if (r6 != 0) goto L_0x0056
        L_0x0054:
            java.lang.String r6 = ""
        L_0x0056:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r5 == 0) goto L_0x005e
            goto L_0x011e
        L_0x005e:
            com.tencent.mm.storage.z1 r5 = r10.f203313u
            if (r5 == 0) goto L_0x006a
            boolean r5 = r5.mo62927s3()
            if (r5 != r3) goto L_0x006a
            r5 = 1
            goto L_0x006b
        L_0x006a:
            r5 = 0
        L_0x006b:
            if (r5 == 0) goto L_0x00f7
            k40.a r5 = f40.C86709a0.m107533q(r0)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.s r5 = r5.mm0()
            com.tencent.mm.storage.z1 r6 = r10.f203313u
            if (r6 == 0) goto L_0x0080
            java.lang.String r6 = r6.getUsername()
            goto L_0x0081
        L_0x0080:
            r6 = r4
        L_0x0081:
            com.tencent.mm.storage.a5 r5 = (com.tencent.p014mm.storage.C44651a5) r5
            com.tencent.mm.storage.z4 r5 = r5.mo69630Lo(r6)
            if (r5 == 0) goto L_0x0099
            java.lang.String r6 = r5.field_encryptUsername
            if (r6 == 0) goto L_0x0096
            boolean r6 = z04.C112551y.m153811k(r6)
            if (r6 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r6 = 0
            goto L_0x0097
        L_0x0096:
            r6 = 1
        L_0x0097:
            if (r6 == 0) goto L_0x00c9
        L_0x0099:
            com.tencent.mm.storage.z1 r6 = r10.f203313u
            if (r6 == 0) goto L_0x00a2
            java.lang.String r6 = r6.mo73978v2()
            goto L_0x00a3
        L_0x00a2:
            r6 = r4
        L_0x00a3:
            if (r6 == 0) goto L_0x00ae
            boolean r6 = z04.C112551y.m153811k(r6)
            if (r6 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r6 = 0
            goto L_0x00af
        L_0x00ae:
            r6 = 1
        L_0x00af:
            if (r6 != 0) goto L_0x00c9
            k40.a r5 = f40.C86709a0.m107533q(r0)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.s r5 = r5.mm0()
            com.tencent.mm.storage.z1 r6 = r10.f203313u
            if (r6 == 0) goto L_0x00c3
            java.lang.String r4 = r6.mo73978v2()
        L_0x00c3:
            com.tencent.mm.storage.a5 r5 = (com.tencent.p014mm.storage.C44651a5) r5
            com.tencent.mm.storage.z4 r5 = r5.mo69630Lo(r4)
        L_0x00c9:
            if (r5 == 0) goto L_0x00e9
            java.lang.String r4 = r5.field_encryptUsername
            if (r4 == 0) goto L_0x00d5
            boolean r4 = z04.C112551y.m153811k(r4)
            if (r4 == 0) goto L_0x00d6
        L_0x00d5:
            r2 = 1
        L_0x00d6:
            if (r2 != 0) goto L_0x00e9
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.s r0 = r0.mm0()
            java.lang.String r2 = r5.field_encryptUsername
            com.tencent.mm.storage.a5 r0 = (com.tencent.p014mm.storage.C44651a5) r0
            r0.mo69631jo(r2)
        L_0x00e9:
            com.tencent.mm.storage.z1 r0 = r10.f203313u
            if (r0 != 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            r0.mo62860K2(r1)
        L_0x00f1:
            com.tencent.mm.storage.z1 r0 = r10.f203313u
            eb0.C45628s0.m50781j0(r0, r1)
            goto L_0x0113
        L_0x00f7:
            com.tencent.mm.storage.z1 r2 = r10.f203313u
            if (r2 != 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            r2.mo62860K2(r1)
        L_0x00ff:
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.s r0 = r0.mm0()
            com.tencent.mm.storage.z4 r2 = new com.tencent.mm.storage.z4
            r2.<init>(r6, r1)
            com.tencent.mm.storage.a5 r0 = (com.tencent.p014mm.storage.C44651a5) r0
            r0.replace(r2)
        L_0x0113:
            android.widget.TextView r10 = r10.getMemberNameTv()
            if (r10 != 0) goto L_0x011a
            goto L_0x011d
        L_0x011a:
            r10.setText(r1)
        L_0x011d:
            r2 = 1
        L_0x011e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView.m82917a(com.tencent.mm.plugin.radar.ui.RadarMemberView):boolean");
    }

    private final ImageView getAvatarCopy() {
        return (ImageView) this.f203301f.getValue();
    }

    private final View getAvatarCopyContainer() {
        return (View) this.f203302g.getValue();
    }

    private final View getAvatarHolder() {
        return (View) this.f203300e.getValue();
    }

    /* access modifiers changed from: private */
    public final Button getConfirmBtn() {
        return (Button) this.f203303h.getValue();
    }

    private final TextView getConfirmBtnDisabled() {
        return (TextView) this.f203304i.getValue();
    }

    private final TextView getExposeTv() {
        return (TextView) this.f203309q.getValue();
    }

    private final TextView getMemberNameTv() {
        return (TextView) this.f203305j.getValue();
    }

    private final Button getModifyNameBtn() {
        return (Button) this.f203306n.getValue();
    }

    private final TextView getSayHiTv() {
        return (TextView) this.f203307o.getValue();
    }

    /* renamed from: c */
    public final void mo96921c() {
        Log.m105918d("MicroMsg.RadarMemberView", "dismiss");
        if (!this.f203312t) {
            this.f203312t = true;
            View view = this.f203299d;
            C87412m.m108591d(view);
            View findViewById = view.findViewById(C0966R.C0970id.ib9);
            C87412m.m108593f(findViewById, "avatarItem!!.findViewByI…d.radar_avatar_container)");
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setFillAfter(true);
            animationSet.setRepeatCount(1);
            animationSet.setDuration(500);
            int[] iArr = this.f203308p;
            int[] iArr2 = new int[2];
            findViewById.getLocationInWindow(iArr2);
            float height = ((float) getAvatarHolder().getHeight()) / ((float) findViewById.getHeight());
            C87412m.m108591d(iArr);
            TranslateAnimation translateAnimation = new TranslateAnimation(((float) iArr[0]) - (((float) ((findViewById.getWidth() - findViewById.getHeight()) / 2)) * height), (float) iArr2[0], (float) iArr[1], (float) iArr2[1]);
            animationSet.addAnimation(new ScaleAnimation(height, 1.0f, height, 1.0f));
            animationSet.addAnimation(translateAnimation);
            animationSet.setAnimationListener(new C70384c(this));
            getMemberNameTv().setVisibility(4);
            getModifyNameBtn().setVisibility(4);
            getConfirmBtn().setVisibility(8);
            getConfirmBtnDisabled().setVisibility(8);
            getSayHiTv().setVisibility(8);
            getExposeTv().setVisibility(8);
            getAvatarCopyContainer().startAnimation(animationSet);
        }
    }

    /* renamed from: d */
    public final void mo96922d(View view, C64496km3 km32, RadarAddContact.C70378d dVar) {
        View view2 = view;
        C64496km3 km33 = km32;
        C87412m.m108594g(view2, "view");
        C87412m.m108594g(km33, "member");
        Log.m105918d("MicroMsg.RadarMemberView", "popup");
        this.f203310r = dVar;
        this.f203311s = km33;
        Class cls = C76979h.class;
        Class cls2 = C75700k0.class;
        Button confirmBtn = getConfirmBtn();
        if (confirmBtn != null) {
            confirmBtn.setOnClickListener(new C75754e(this, km33));
        }
        getModifyNameBtn().setOnClickListener(this.f203315w);
        setOnTouchListener(new C75755f(this));
        getExposeTv().setOnClickListener(new C45772g(this));
        String str = km33.f183957d;
        if (str == null && (str = km33.f183961h) == null) {
            str = "";
        }
        if (!C112551y.m153811k(str)) {
            this.f203313u = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(str);
        }
        C72996z1 z1Var = this.f203313u;
        String str2 = null;
        if (z1Var != null && z1Var.mo62927s3()) {
            C72996z1 z1Var2 = this.f203313u;
            if (z1Var2 != null) {
                str2 = z1Var2.mo73969n2();
            }
        } else {
            C44673z4 Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(cls2)).mm0()).mo69630Lo(str);
            if (Lo != null) {
                str2 = Lo.field_conRemark;
            }
        }
        getMemberNameTv().setText((this.f203313u == null || Util.isNullOrNil(str2)) ? ((C76979h) C86312j.m106911c(cls)).yp0(getContext(), km33.f183959f, getMemberNameTv().getTextSize()) : ((C76979h) C86312j.m106911c(cls)).yp0(getContext(), str2, getMemberNameTv().getTextSize()));
        getMemberNameTv().setVisibility(4);
        getModifyNameBtn().setVisibility(4);
        mo96923e();
        this.f203299d = view2;
        View findViewById = view2.findViewById(C0966R.C0970id.ibq);
        C87412m.m108593f(findViewById, "avatarItem!!.findViewByI…ar_result_item_avatar_iv)");
        View view3 = this.f203299d;
        C87412m.m108591d(view3);
        View findViewById2 = view3.findViewById(C0966R.C0970id.ib9);
        C87412m.m108593f(findViewById2, "avatarItem!!.findViewByI…d.radar_avatar_container)");
        View view4 = this.f203299d;
        C87412m.m108591d(view4);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view5 = view4;
        C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarMemberView", "popup", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/radar/ui/RadarMemberView", "popup", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getAvatarCopy().setImageDrawable(((ImageView) findViewById).getDrawable());
        View avatarCopyContainer = getAvatarCopyContainer();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view6 = avatarCopyContainer;
        C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarMemberView", "popup", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        avatarCopyContainer.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/radar/ui/RadarMemberView", "popup", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int[] iArr = new int[2];
        findViewById2.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        getAvatarHolder().getLocationInWindow(iArr2);
        this.f203308p = iArr2;
        setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.setRepeatCount(1);
        animationSet.setDuration(500);
        float height = ((float) getAvatarHolder().getHeight()) / ((float) findViewById2.getHeight());
        TranslateAnimation translateAnimation = new TranslateAnimation((float) iArr[0], ((float) iArr2[0]) - (((float) ((findViewById2.getWidth() - findViewById2.getHeight()) / 2)) * height), (float) iArr[1], (float) iArr2[1]);
        animationSet.addAnimation(new ScaleAnimation(1.0f, height, 1.0f, height));
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new C70385d(this));
        getAvatarCopyContainer().startAnimation(animationSet);
    }

    /* renamed from: e */
    public final void mo96923e() {
        View avatarCopyContainer = getAvatarCopyContainer();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(avatarCopyContainer, aVar.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarMemberView", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        avatarCopyContainer.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(avatarCopyContainer, "com/tencent/mm/plugin/radar/ui/RadarMemberView", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getMemberNameTv().setVisibility(4);
        getModifyNameBtn().setVisibility(4);
        getConfirmBtn().setVisibility(8);
        getConfirmBtnDisabled().setVisibility(8);
        getSayHiTv().setVisibility(8);
        getExposeTv().setVisibility(8);
    }

    /* renamed from: f */
    public final void mo96924f(C64496km3 km32, RadarAddContact.C70378d dVar) {
        getExposeTv().setVisibility(0);
        int i = dVar == null ? -1 : C70383b.f203319a[dVar.ordinal()];
        if (i == 1) {
            getMemberNameTv().setVisibility(0);
            getModifyNameBtn().setVisibility(0);
            getConfirmBtn().setText(C0966R.string.hr4);
            getConfirmBtn().setVisibility(0);
            getConfirmBtnDisabled().setVisibility(8);
            getSayHiTv().setVisibility(8);
        } else if (i == 2) {
            getMemberNameTv().setVisibility(0);
            getModifyNameBtn().setVisibility(0);
            getConfirmBtnDisabled().setText(C0966R.string.hra);
            getConfirmBtn().setVisibility(8);
            getConfirmBtnDisabled().setVisibility(0);
            getSayHiTv().setVisibility(8);
        } else if (i == 3) {
            getMemberNameTv().setVisibility(0);
            getModifyNameBtn().setVisibility(0);
            getConfirmBtnDisabled().setText(C0966R.string.hqq);
            getConfirmBtn().setVisibility(8);
            getConfirmBtnDisabled().setVisibility(0);
            getSayHiTv().setVisibility(8);
        } else if (i == 4) {
            getMemberNameTv().setVisibility(0);
            getModifyNameBtn().setVisibility(0);
            getConfirmBtn().setText(C0966R.string.hqp);
            getConfirmBtn().setVisibility(0);
            getConfirmBtnDisabled().setVisibility(8);
            getSayHiTv().setText(getContext().getString(C0966R.string.f361160hr2));
            getSayHiTv().setVisibility(0);
        }
    }

    /* renamed from: g */
    public final void mo96925g(String str, RadarAddContact.C70378d dVar) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(dVar, "state");
        if ((getVisibility() == 0) && !this.f203312t) {
            C64496km3 km32 = this.f203311s;
            String str2 = null;
            if (!C87412m.m108589b(str, km32 != null ? km32.f183961h : null)) {
                C64496km3 km33 = this.f203311s;
                if (km33 != null) {
                    str2 = km33.f183957d;
                }
                if (!C87412m.m108589b(str, str2)) {
                    return;
                }
            }
            mo96924f(this.f203311s, dVar);
        }
    }

    public final C64496km3 getMember() {
        return this.f203311s;
    }

    public final RadarAddContact.C70378d getState() {
        return this.f203310r;
    }

    public final void setListener(C70382a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f203314v = aVar;
    }

    public final void setMember(C64496km3 km32) {
        this.f203311s = km32;
    }

    public final void setState(RadarAddContact.C70378d dVar) {
        this.f203310r = dVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarMemberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
