package uy2;

import androidx.appcompat.app.AppCompatActivity;
import az2.C39674e;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nz2.C47313a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: uy2.f */
public final class C52661f extends UIComponent {

    /* renamed from: d */
    public final C13601g f147049d = C36568h.m40985a(new C52664c(this));

    /* renamed from: e */
    public final C13601g f147050e = C36568h.m40985a(new C52663b(this));

    /* renamed from: f */
    public final C13601g f147051f = C36568h.m40985a(new C52662a(this));

    /* renamed from: uy2.f$a */
    public static final class C52662a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C52661f f147052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52662a(C52661f fVar) {
            super(0);
            this.f147052d = fVar;
        }

        public Object invoke() {
            int i;
            String str;
            C47313a f0 = C39674e.f106452d.mo62248f0();
            if (!(f0.mo72361a() == 0 || ((Number) ((C36570n) this.f147052d.f147049d).getValue()).intValue() == 0)) {
                if (f0.f126986b > 0) {
                    str = f0.f126987c;
                } else {
                    C47313a.C47314a aVar = f0.f126985a;
                    if (aVar == null || (str = aVar.f126988a) == null) {
                        str = "";
                    }
                }
                if (C72996z1.m85799F5(str)) {
                    i = 1;
                    return Integer.valueOf(i);
                }
            }
            i = 0;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: uy2.f$b */
    public static final class C52663b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C52661f f147053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52663b(C52661f fVar) {
            super(0);
            this.f147053d = fVar;
        }

        public Object invoke() {
            ((Number) ((C36570n) this.f147053d.f147049d).getValue()).intValue();
            return 1;
        }
    }

    /* renamed from: uy2.f$c */
    public static final class C52664c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C52661f f147054d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52664c(C52661f fVar) {
            super(0);
            this.f147054d = fVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f147054d.getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52661f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
