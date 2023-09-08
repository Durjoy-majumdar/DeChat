package gn1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import cc2.C67350b;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: gn1.a */
public class C75991a extends UIComponent implements C11385n {

    /* renamed from: d */
    public C67350b f222830d;

    /* renamed from: e */
    public C67350b f222831e;

    /* renamed from: f */
    public final Map<String, C75992a> f222832f = new HashMap();

    /* renamed from: gn1.a$a */
    public static final class C75992a {

        /* renamed from: a */
        public String f222833a;

        /* renamed from: b */
        public int f222834b;

        /* renamed from: c */
        public int f222835c;

        /* renamed from: d */
        public int f222836d;

        /* renamed from: e */
        public String f222837e;

        /* renamed from: f */
        public String f222838f;

        /* renamed from: g */
        public String f222839g;

        /* renamed from: h */
        public int f222840h;

        /* renamed from: i */
        public String f222841i;

        /* renamed from: j */
        public int f222842j;

        /* renamed from: k */
        public int f222843k;

        /* renamed from: l */
        public int f222844l = -1;

        /* renamed from: m */
        public boolean f222845m;
    }

    /* renamed from: gn1.a$b */
    public static final class C75993b {

        /* renamed from: a */
        public float f222846a;

        /* renamed from: b */
        public float f222847b;

        /* renamed from: c */
        public int f222848c;

        public C75993b(float f, float f2, int i) {
            this.f222846a = f;
            this.f222847b = f2;
            this.f222848c = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75991a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75991a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
