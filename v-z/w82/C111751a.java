package w82;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105883g;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.MultiTalkSmallControlIconLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import w80.C111744e;

/* renamed from: w82.a */
public final class C111751a extends LinearLayout {

    /* renamed from: d */
    public final C13601g f334662d;

    /* renamed from: e */
    public final C13601g f334663e = C36568h.m40985a(new C111753b(this));

    /* renamed from: f */
    public final C13601g f334664f = C36568h.m40985a(new C111756e(this));

    /* renamed from: g */
    public final C0120a0<Boolean> f334665g;

    /* renamed from: h */
    public final C0120a0<Boolean> f334666h;

    /* renamed from: w82.a$a */
    public static final class C111752a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C111751a f334667d;

        public C111752a(C111751a aVar) {
            this.f334667d = aVar;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f334667d.mo163490d();
        }
    }

    /* renamed from: w82.a$b */
    public static final class C111753b extends C87413o implements C32224a<MultiTalkSmallControlIconLayout> {

        /* renamed from: d */
        public final /* synthetic */ C111751a f334668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111753b(C111751a aVar) {
            super(0);
            this.f334668d = aVar;
        }

        public Object invoke() {
            return (MultiTalkSmallControlIconLayout) this.f334668d.findViewById(C0966R.C0970id.kbx);
        }
    }

    /* renamed from: w82.a$c */
    public static final class C111754c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C111751a f334669d;

        /* renamed from: e */
        public final /* synthetic */ Context f334670e;

        public C111754c(C111751a aVar, Context context) {
            this.f334669d = aVar;
            this.f334670e = context;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            MultiTalkSmallControlIconLayout c = this.f334669d.getVirtualBackgroundSwitcher();
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            c.setChecked(bool.booleanValue());
            if (bool.booleanValue()) {
                this.f334669d.getVirtualBackgroundSwitcher().setContentDescription(this.f334670e.getString(C0966R.string.md5));
            } else {
                this.f334669d.getVirtualBackgroundSwitcher().setContentDescription(this.f334670e.getString(C0966R.string.md4));
            }
        }
    }

    /* renamed from: w82.a$d */
    public static final class C111755d extends C87413o implements C32224a<C105883g> {

        /* renamed from: d */
        public final /* synthetic */ Context f334671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111755d(Context context) {
            super(0);
            this.f334671d = context;
        }

        public Object invoke() {
            return (C105883g) C39818r.f106831a.mo62443b(this.f334671d).mo75002a(C105883g.class);
        }
    }

    /* renamed from: w82.a$e */
    public static final class C111756e extends C87413o implements C32224a<MultiTalkSmallControlIconLayout> {

        /* renamed from: d */
        public final /* synthetic */ C111751a f334672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111756e(C111751a aVar) {
            super(0);
            this.f334672d = aVar;
        }

        public Object invoke() {
            return (MultiTalkSmallControlIconLayout) this.f334672d.findViewById(C0966R.C0970id.kby);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111751a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f334662d = C36568h.m40985a(new C111755d(context));
        LayoutInflater.from(context).inflate(C0966R.C0971layout.cja, this, true);
        this.f334665g = new C111752a(this);
        this.f334666h = new C111754c(this, context);
    }

    /* access modifiers changed from: private */
    public final MultiTalkSmallControlIconLayout getCameraSwitcher() {
        return (MultiTalkSmallControlIconLayout) ((C36570n) this.f334663e).getValue();
    }

    /* access modifiers changed from: private */
    public final C105883g getViewModel() {
        return (C105883g) ((C36570n) this.f334662d).getValue();
    }

    /* access modifiers changed from: private */
    public final MultiTalkSmallControlIconLayout getVirtualBackgroundSwitcher() {
        return (MultiTalkSmallControlIconLayout) ((C36570n) this.f334664f).getValue();
    }

    /* renamed from: d */
    public final void mo163490d() {
        if (getVisibility() == 0) {
            Boolean value = getViewModel().f314939i.getValue();
            if (value == null) {
                value = Boolean.FALSE;
            }
            boolean booleanValue = value.booleanValue();
            Class cls = C32735h.class;
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_virtual_background_gpu_rating, 40);
            int i = 0;
            boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_multitalk_virtual_background_disable, false);
            int f = C111744e.f334654d.mo163483f();
            Log.m105924i("MicroMsg.MT.MultiTalkAvatarControlLayout", "gpuRatingLimiting: " + Qe + ", gpuRating: " + f + ", disableVirtualBackground: " + wf);
            boolean z = f >= Qe && !wf;
            Log.m105924i("MicroMsg.MT.MultiTalkAvatarControlLayout", "enable: " + z + " cam: " + booleanValue);
            getCameraSwitcher().setVisibility(booleanValue ? 0 : 8);
            MultiTalkSmallControlIconLayout virtualBackgroundSwitcher = getVirtualBackgroundSwitcher();
            if (!z || !booleanValue) {
                i = 8;
            }
            virtualBackgroundSwitcher.setVisibility(i);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            mo163490d();
            Context context = getContext();
            String str = null;
            C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
            if (sVar != null) {
                getViewModel().f314939i.observe(sVar, this.f334665g);
                getViewModel().f314947t.observe(sVar, this.f334666h);
            }
            getCameraSwitcher().setOnClickListener(new C111757b(this));
            if (C105851w0.vx0().mo150810e()) {
                MultiTalkSmallControlIconLayout cameraSwitcher = getCameraSwitcher();
                Context context2 = getContext();
                if (context2 != null) {
                    str = context2.getString(C0966R.string.gzb);
                }
                cameraSwitcher.setContentDescription(str);
            } else {
                MultiTalkSmallControlIconLayout cameraSwitcher2 = getCameraSwitcher();
                Context context3 = getContext();
                if (context3 != null) {
                    str = context3.getString(C0966R.string.gyj);
                }
                cameraSwitcher2.setContentDescription(str);
            }
            getVirtualBackgroundSwitcher().setOnClickListener(new C111758c(this));
            return;
        }
        getViewModel().f314939i.removeObserver(this.f334665g);
        getViewModel().f314947t.removeObserver(this.f334666h);
    }
}
