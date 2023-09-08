package rs1;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58784w3;
import er1.C7865r3;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import l60.C99344b;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qo3.C101218e0;
import r60.C101350i;
import t60.C64207e;
import te3.C48996cf1;
import up1.C27696y;
import wp1.C15587j;
import x60.C102564a;
import zt3.C119157j;

/* renamed from: rs1.y7 */
public final class C13549y7 extends UIComponent {

    /* renamed from: rs1.y7$a */
    public static final class C13550a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101218e0 f38431d;

        public C13550a(C101218e0 e0Var) {
            this.f38431d = e0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateLikeMigrateUIC$realShowPrivateLikeMigrateDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f38431d.mo140680z();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateLikeMigrateUIC$realShowPrivateLikeMigrateDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.y7$b */
    public static final class C13551b<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ TextView f38432a;

        /* renamed from: b */
        public final /* synthetic */ C13549y7 f38433b;

        /* renamed from: c */
        public final /* synthetic */ int f38434c;

        public C13551b(TextView textView, C13549y7 y7Var, int i) {
            this.f38432a = textView;
            this.f38433b = y7Var;
            this.f38434c = i;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            ((C119157j) C119157j.f356862d).mo183895z(new C13570z7((Bitmap) obj, this.f38432a, this.f38433b, this.f38434c));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13549y7(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo12954c3() {
        String str;
        String str2;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C101218e0 e0Var = new C101218e0(getContext(), 0, 0);
        e0Var.mo140674t(-2);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cvi, (ViewGroup) null);
        inflate.setMinimumHeight((int) (((float) C7865r3.f26468a.mo8968a()) * 0.5f));
        inflate.findViewById(C0966R.C0970id.n0b).setOnClickListener(new C13550a(e0Var));
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.n0e);
        int dimension = (int) getResources().getDimension(C0966R.dimen.f3743cv);
        C48996cf1 a = C15587j.f42215a.mo14349a("FinderObjectDynamicImageKey_FinderFavOffBoldIcon");
        if (a == null || (str = a.f131694e) == null) {
            str = "";
        }
        if (!Util.isNullOrNil(str)) {
            if (textView != null) {
                textView.setText(getContext().getString(C0966R.string.mlx));
            }
            C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.FAV_ICON));
            C13551b bVar = new C13551b(textView, this, dimension);
            b.getClass();
            b.f291320d = bVar;
            b.mo85953c();
        } else if (textView != null) {
            C58784w3 w3Var = C58784w3.f168295a;
            Activity context = getContext();
            String string = getContext().getString(C0966R.string.meh);
            C87412m.m108593f(string, "context.getString(R.stri…_star_guide_dialog_title)");
            textView.setText(w3Var.mo83957q1(context, string, '#', C0966R.raw.icons_outlined_star_new_bold, C0966R.color.FG_0, dimension, dimension));
        }
        PAGView pAGView = (PAGView) inflate.findViewById(C0966R.C0970id.n0d);
        boolean z = true;
        pAGView.setRepeatCount(1);
        AssetManager assets = getContext().getAssets();
        boolean b2 = C87412m.m108589b(LocaleUtil.getCurrentLanguage(getContext()), "zh_CN");
        if (!C87412m.m108589b(LocaleUtil.getCurrentLanguage(getContext()), "zh_TW") && !C87412m.m108589b(LocaleUtil.getCurrentLanguage(getContext()), "zh_HK")) {
            z = false;
        }
        boolean z2 = C85875k4.m106211z();
        if (!b2 || !z2) {
            if (!b2 || z2) {
                if (z && z2) {
                    str2 = "finder_private_like_migrate_tr_dark.pag";
                } else if (z && !z2) {
                    str2 = "finder_private_like_migrate_tr.pag";
                } else if (!b2 && !z && z2) {
                    str2 = "finder_private_like_migrate_en_dark.pag";
                } else if (!b2 && !z && !z2) {
                    str2 = "finder_private_like_migrate_en.pag";
                }
            }
            str2 = "finder_private_like_migrate.pag";
        } else {
            str2 = "finder_private_like_migrate_dark.pag";
        }
        pAGView.setComposition(PAGFile.Load(assets, str2));
        pAGView.play();
        e0Var.mo140664k(inflate, 0, 0);
        e0Var.mo140655A();
    }
}
