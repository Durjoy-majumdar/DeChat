package com.tencent.p014mm.plugin.radar.p091ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fg2.C75751c0;
import fg2.C75761v;
import fg2.C75762w;
import fg2.C75764y;
import fg2.C75765z;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%B!\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, mo182094d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarTipsView;", "Landroid/widget/RelativeLayout;", "", "noMember", "Lrx3/b0;", "setNoMember", "show", "setPressingDown", "Landroid/view/animation/Animation;", "e", "Lrx3/g;", "getTipsFadeIn", "()Landroid/view/animation/Animation;", "tipsFadeIn", "f", "getTipsFadeOut", "tipsFadeOut", "Landroid/widget/TextView;", "g", "getTvTextTips", "()Landroid/widget/TextView;", "tvTextTips", "Landroid/view/View;", "h", "getTextTipsContainer", "()Landroid/view/View;", "textTipsContainer", "Landroid/widget/LinearLayout;", "i", "getNoviceEducationTips", "()Landroid/widget/LinearLayout;", "noviceEducationTips", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarTipsView */
public final class RadarTipsView extends RelativeLayout {

    /* renamed from: v */
    public static final /* synthetic */ int f203329v = 0;

    /* renamed from: d */
    public final C75761v f203330d = new C75761v(this);

    /* renamed from: e */
    public final C13601g f203331e = C36568h.m40985a(new C75762w(this));

    /* renamed from: f */
    public final C13601g f203332f = C36568h.m40985a(new C75764y(this));

    /* renamed from: g */
    public final C13601g f203333g = C75751c0.m91019a(this, C0966R.C0970id.iby);

    /* renamed from: h */
    public final C13601g f203334h = C75751c0.m91019a(this, C0966R.C0970id.ibw);

    /* renamed from: i */
    public final C13601g f203335i = C75751c0.m91019a(this, C0966R.C0970id.ibz);

    /* renamed from: j */
    public final int f203336j = 1;

    /* renamed from: n */
    public final int f203337n = 2;

    /* renamed from: o */
    public final int f203338o = 3;

    /* renamed from: p */
    public final int f203339p = 3;

    /* renamed from: q */
    public final C75765z f203340q = new C75765z(this, Looper.getMainLooper());

    /* renamed from: r */
    public boolean f203341r;

    /* renamed from: s */
    public boolean f203342s = true;

    /* renamed from: t */
    public boolean f203343t;

    /* renamed from: u */
    public long f203344u;

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarTipsView$a */
    public static final class C70389a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RadarTipsView f203345d;

        public C70389a(RadarTipsView radarTipsView) {
            this.f203345d = radarTipsView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/radar/ui/RadarTipsView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = RadarTipsView.f203329v;
            Log.m105918d("MicroMsg.RadarTipsView", "noviceEducationTips onclick");
            this.f203345d.mo96947a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/radar/ui/RadarTipsView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    private final LinearLayout getNoviceEducationTips() {
        return (LinearLayout) this.f203335i.getValue();
    }

    private final View getTextTipsContainer() {
        return (View) this.f203334h.getValue();
    }

    private final Animation getTipsFadeIn() {
        Object value = this.f203331e.getValue();
        C87412m.m108593f(value, "<get-tipsFadeIn>(...)");
        return (Animation) value;
    }

    private final Animation getTipsFadeOut() {
        Object value = this.f203332f.getValue();
        C87412m.m108593f(value, "<get-tipsFadeOut>(...)");
        return (Animation) value;
    }

    private final TextView getTvTextTips() {
        return (TextView) this.f203333g.getValue();
    }

    /* renamed from: a */
    public final void mo96947a() {
        this.f203341r = false;
        Log.m105918d("MicroMsg.RadarTipsView", "hidNoviceEducation");
        this.f203340q.removeMessages(this.f203338o);
        if (getVisibility() == 0 && getNoviceEducationTips().getVisibility() == 0) {
            getNoviceEducationTips().clearAnimation();
            if (getTextTipsContainer().getAnimation() == getTipsFadeOut()) {
                getTextTipsContainer().clearAnimation();
            }
            Log.m105918d("MicroMsg.RadarTipsView", "hideNoviceEducation real");
            getNoviceEducationTips().startAnimation(getTipsFadeOut());
        }
    }

    /* renamed from: b */
    public final void mo96948b() {
        Log.m105918d("MicroMsg.RadarTipsView", "hideRadarTips");
        if (getVisibility() == 0 && getTextTipsContainer().getVisibility() == 0) {
            if (getNoviceEducationTips().getAnimation() == getTipsFadeOut()) {
                getNoviceEducationTips().clearAnimation();
            }
            getTextTipsContainer().clearAnimation();
            Log.m105918d("MicroMsg.RadarTipsView", "hideRadarTips real");
            this.f203341r = false;
            getTextTipsContainer().startAnimation(getTipsFadeOut());
        }
    }

    /* renamed from: c */
    public final void mo96949c() {
        getNoviceEducationTips().setOnClickListener(new C70389a(this));
    }

    /* renamed from: d */
    public final void mo96950d(String str) {
        C87412m.m108594g(str, "msg");
        mo96952f(str, 5000);
    }

    /* renamed from: e */
    public final void mo96951e() {
        this.f203341r = true;
        Log.m105918d("MicroMsg.RadarTipsView", "showNoviceEducation");
        View textTipsContainer = getTextTipsContainer();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = textTipsContainer;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarTipsView", "showNoviceEducation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textTipsContainer.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/radar/ui/RadarTipsView", "showNoviceEducation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getTextTipsContainer().clearAnimation();
        setVisibility(0);
        getNoviceEducationTips().setVisibility(0);
        getNoviceEducationTips().startAnimation(getTipsFadeIn());
        getNoviceEducationTips().requestFocus();
    }

    /* renamed from: f */
    public final void mo96952f(String str, int i) {
        C87412m.m108594g(str, "msg");
        this.f203341r = true;
        getNoviceEducationTips().setVisibility(8);
        getNoviceEducationTips().clearAnimation();
        getTvTextTips().setText(str);
        setVisibility(0);
        View textTipsContainer = getTextTipsContainer();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(textTipsContainer, aVar.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarTipsView", "showRadarTips", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textTipsContainer.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(textTipsContainer, "com/tencent/mm/plugin/radar/ui/RadarTipsView", "showRadarTips", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getTextTipsContainer().startAnimation(getTipsFadeIn());
        this.f203340q.removeMessages(0);
        this.f203340q.removeMessages(this.f203337n);
        if (i > 0) {
            this.f203340q.sendEmptyMessageDelayed(0, (long) i);
        }
    }

    public final void setNoMember(boolean z) {
        this.f203342s = z;
        if (!z) {
            mo96948b();
            this.f203341r = false;
            C75765z zVar = this.f203340q;
            zVar.removeMessages(this.f203336j);
            zVar.removeMessages(this.f203337n);
            zVar.removeMessages(this.f203338o);
            mo96947a();
        }
    }

    public final void setPressingDown(boolean z) {
        if (this.f203344u != 0) {
            this.f203341r = false;
            C75765z zVar = this.f203340q;
            zVar.removeMessages(this.f203336j);
            zVar.removeMessages(this.f203337n);
            zVar.removeMessages(this.f203338o);
            mo96948b();
            View textTipsContainer = getTextTipsContainer();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = textTipsContainer;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarTipsView", "hideAll", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textTipsContainer.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/radar/ui/RadarTipsView", "hideAll", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getNoviceEducationTips().setVisibility(8);
            setVisibility(8);
        }
        this.f203343t = true;
        this.f203344u = Util.currentTicks();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
