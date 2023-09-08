package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.FTSBaseMainUI;
import com.tencent.p014mm.plugin.fts.p059ui.widget.C18874c;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nl3.C47276a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.a */
public final class C18865a extends C47276a {

    /* renamed from: s */
    public final C18879e f52903s;

    /* renamed from: t */
    public final C13601g f52904t;

    /* renamed from: u */
    public final C13601g f52905u = C36568h.m40985a(new C18869f(this));

    /* renamed from: v */
    public final C13601g f52906v = C36568h.m40985a(new C18866b(this));

    /* renamed from: w */
    public final C13601g f52907w;

    /* renamed from: x */
    public final C13601g f52908x;

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.a$b */
    public static final class C18866b extends C87413o implements C32224a<ProgressBar> {

        /* renamed from: d */
        public final /* synthetic */ C18865a f52909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18866b(C18865a aVar) {
            super(0);
            this.f52909d = aVar;
        }

        public Object invoke() {
            return (ProgressBar) FTSBaseMainUI.this.findViewById(C0966R.C0970id.f359522lc1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.a$c */
    public static final class C18867c implements C18874c.C18877c {

        /* renamed from: a */
        public final /* synthetic */ C18865a f52910a;

        public C18867c(C18865a aVar) {
            this.f52910a = aVar;
        }

        /* renamed from: a */
        public void mo23773a(String str, String str2) {
            ((FTSBaseMainUI.C18818d) this.f52910a.f52903s).mo23773a(str, str2);
            this.f52910a.dismiss();
        }

        /* renamed from: b */
        public void mo23774b(boolean z, boolean z2, String str) {
            ((FTSBaseMainUI.C18818d) this.f52910a.f52903s).mo23774b(z, z2, str);
        }

        /* renamed from: c */
        public void mo23775c(String str) {
            ((FTSBaseMainUI.C18818d) this.f52910a.f52903s).mo23775c(str);
        }

        /* renamed from: d */
        public void mo23776d() {
            ((FTSBaseMainUI.C18818d) this.f52910a.f52903s).mo23776d();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.a$e */
    public static final class C18868e implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C18865a f52911d;

        public C18868e(C18865a aVar) {
            this.f52911d = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C18874c cVar = (C18874c) ((C36570n) this.f52911d.f52907w).getValue();
            FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl = cVar.f52922d;
            if (fTSVoiceInputLayoutImpl != null) {
                fTSVoiceInputLayoutImpl.mo23860a();
                FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl2 = cVar.f52922d;
                MMHandler mMHandler = fTSVoiceInputLayoutImpl2.f52897n;
                if (mMHandler != null) {
                    mMHandler.removeCallbacksAndMessages((Object) null);
                }
                MMHandler mMHandler2 = fTSVoiceInputLayoutImpl2.f52898o;
                if (mMHandler2 != null) {
                    mMHandler2.removeCallbacksAndMessages((Object) null);
                }
                MTimerHandler mTimerHandler = fTSVoiceInputLayoutImpl2.f52899p;
                if (mTimerHandler != null) {
                    mTimerHandler.stopTimer();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.a$f */
    public static final class C18869f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18865a f52912d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18869f(C18865a aVar) {
            super(0);
            this.f52912d = aVar;
        }

        public Object invoke() {
            return (TextView) FTSBaseMainUI.this.findViewById(C0966R.C0970id.f359524lc3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.a$g */
    public static final class C18870g extends C87413o implements C32224a<C18874c> {

        /* renamed from: d */
        public final /* synthetic */ Context f52913d;

        /* renamed from: e */
        public final /* synthetic */ C18865a f52914e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18870g(Context context, C18865a aVar) {
            super(0);
            this.f52913d = context;
            this.f52914e = aVar;
        }

        public Object invoke() {
            return new C18874c(this.f52913d, (FTSVoiceInputLayoutImpl) ((C36570n) this.f52914e.f52904t).getValue(), (TextView) ((C36570n) this.f52914e.f52905u).getValue(), (ProgressBar) ((C36570n) this.f52914e.f52906v).getValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.a$h */
    public static final class C18871h extends C87413o implements C32224a<FTSVoiceInputLayoutImpl> {

        /* renamed from: d */
        public final /* synthetic */ C18865a f52915d;

        /* renamed from: e */
        public final /* synthetic */ Context f52916e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18871h(C18865a aVar, Context context) {
            super(0);
            this.f52915d = aVar;
            this.f52916e = context;
        }

        public Object invoke() {
            C68992b voiceInputDrawable;
            C68992b voiceInputDrawable2;
            View findViewById = this.f52915d.findViewById(C0966R.C0970id.egb);
            Context context = this.f52916e;
            FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl = (FTSVoiceInputLayoutImpl) findViewById;
            if (!(fTSVoiceInputLayoutImpl == null || (voiceInputDrawable2 = fTSVoiceInputLayoutImpl.getVoiceInputDrawable()) == null)) {
                voiceInputDrawable2.f198244e = C76577a.m92153d(context, C0966R.color.akw);
            }
            if (!(fTSVoiceInputLayoutImpl == null || (voiceInputDrawable = fTSVoiceInputLayoutImpl.getVoiceInputDrawable()) == null)) {
                voiceInputDrawable.f198241b = C76577a.m92158i(context, C0966R.C0969drawable.c3e);
            }
            if (fTSVoiceInputLayoutImpl != null) {
                fTSVoiceInputLayoutImpl.setActivity(context instanceof Activity ? (Activity) context : null);
            }
            if (fTSVoiceInputLayoutImpl != null) {
                fTSVoiceInputLayoutImpl.invalidate();
            }
            return fTSVoiceInputLayoutImpl;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.a$a */
    public static final class C18872a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18865a f52917d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18872a(C18865a aVar) {
            super(0);
            this.f52917d = aVar;
        }

        public Object invoke() {
            return this.f52917d.findViewById(C0966R.C0970id.bec);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.a$d */
    public static final class C18873d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C18865a f52918d;

        public C18873d(C18865a aVar) {
            this.f52918d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputDialog$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f52918d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputDialog$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18865a(Context context, C18879e eVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(eVar, "proxy");
        this.f52903s = eVar;
        this.f52904t = C36568h.m40985a(new C18871h(this, context));
        this.f52907w = C36568h.m40985a(new C18870g(context, this));
        this.f52908x = C36568h.m40985a(new C18872a(this));
    }

    /* renamed from: F */
    public int mo23875F() {
        return C76577a.m92159j(getContext()) - C76577a.m92151b(getContext(), C0947jz.f2205e);
    }

    /* renamed from: G */
    public View mo6265G() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.att, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…voice_input_dialog, null)");
        return inflate;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View view = (View) ((C36570n) this.f52908x).getValue();
        if (view != null) {
            view.setContentDescription(getContext().getString(C0966R.string.ihp));
        }
        ((C18874c) ((C36570n) this.f52907w).getValue()).f52920b = new C18867c(this);
        View view2 = (View) ((C36570n) this.f52908x).getValue();
        if (view2 != null) {
            view2.setOnClickListener(new C18873d(this));
        }
        this.f126908o = new C18868e(this);
    }
}
