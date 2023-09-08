package d60;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c60.C54670c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: d60.o0 */
public final class C58192o0 extends C58121a {

    /* renamed from: f */
    public final C58124b f166653f;

    /* renamed from: g */
    public final RelativeLayout f166654g;

    /* renamed from: h */
    public final ProgressBar f166655h;

    /* renamed from: i */
    public final TextView f166656i;

    /* renamed from: d60.o0$a */
    public static final class C58193a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C58192o0 f166657a;

        /* renamed from: b */
        public final /* synthetic */ int f166658b;

        public C58193a(C58192o0 o0Var, int i) {
            this.f166657a = o0Var;
            this.f166658b = i;
        }

        public void onAnimationEnd(Animation animation) {
            this.f166657a.f166287d.setVisibility(this.f166658b);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: d60.o0$b */
    public static final class C58194b extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58192o0 f166659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58194b(C58192o0 o0Var) {
            super(1);
            this.f166659d = o0Var;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.f166659d.f166654g.setBackground(new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap));
            }
            this.f166659d.f166655h.setVisibility(0);
            this.f166659d.f166656i.setVisibility(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.o0$c */
    public static final class C58195c extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58192o0 f166660d;

        /* renamed from: e */
        public final /* synthetic */ String f166661e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58195c(C58192o0 o0Var, String str) {
            super(1);
            this.f166660d = o0Var;
            this.f166661e = str;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.f166660d.f166654g.setBackground(new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap));
            }
            this.f166660d.f166655h.setVisibility(8);
            this.f166660d.f166656i.setVisibility(0);
            this.f166660d.f166656i.setText(this.f166661e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58192o0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166653f = bVar;
        this.f166654g = (RelativeLayout) viewGroup.findViewById(C0966R.C0970id.fv6);
        this.f166655h = (ProgressBar) viewGroup.findViewById(C0966R.C0970id.fv5);
        this.f166656i = (TextView) viewGroup.findViewById(C0966R.C0970id.hat);
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (this.f166287d.getVisibility() != i) {
            if (i == 0) {
                this.f166287d.setVisibility(i);
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f166287d.getContext(), C0966R.C0968anim.f2394bx);
            loadAnimation.setDuration(300);
            loadAnimation.setAnimationListener(new C58193a(this, i));
            this.f166287d.startAnimation(loadAnimation);
            this.f166287d.invalidate();
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 27) {
            if (!(ordinal == 28 || ordinal == 30)) {
                if (ordinal == 50) {
                    this.f166655h.setVisibility(0);
                    this.f166654g.setVisibility(8);
                    this.f166656i.setVisibility(8);
                    this.f166287d.setVisibility(0);
                    return;
                } else if (ordinal != 52) {
                    return;
                }
            }
            mo10792g(8);
            return;
        }
        this.f166655h.setVisibility(8);
    }

    /* renamed from: x0 */
    public final void mo82950x0(String str) {
        this.f166654g.setVisibility(0);
        if (Util.isNullOrNil(str)) {
            this.f166655h.setVisibility(0);
            this.f166656i.setVisibility(8);
            return;
        }
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        String str2 = RoomLiveService.f157199j;
        int color = this.f166287d.getContext().getResources().getColor(C0966R.color.a1u);
        C58194b bVar = new C58194b(this);
        ((C119157j) C119157j.f356862d).mo183875f(new C54670c(str2, bVar, color));
        this.f166287d.setVisibility(0);
    }

    /* renamed from: y0 */
    public final void mo82951y0(String str, String str2) {
        C87412m.m108594g(str2, "tip");
        this.f166654g.setVisibility(0);
        if (Util.isNullOrNil(str)) {
            this.f166655h.setVisibility(8);
            this.f166656i.setVisibility(0);
            this.f166656i.setText(str2);
            return;
        }
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        String str3 = RoomLiveService.f157199j;
        int color = this.f166287d.getContext().getResources().getColor(C0966R.color.a1u);
        C58195c cVar = new C58195c(this, str2);
        ((C119157j) C119157j.f356862d).mo183875f(new C54670c(str3, cVar, color));
        this.f166287d.setVisibility(0);
    }
}
