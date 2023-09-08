package mo1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.FinderMsgFeedDetailUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedDetailUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileUIFragment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58684b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: mo1.w */
public abstract class C11059w extends UIComponent {

    /* renamed from: d */
    public final C13601g f32819d = C36568h.m40985a(new C11060a(this));

    /* renamed from: mo1.w$a */
    public static final class C11060a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C11059w f32820d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11060a(C11059w wVar) {
            super(0);
            this.f32820d = wVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if ((r0 != null ? r0.getBooleanExtra(com.tencent.p014mm.p136ui.vas.VASActivity.KEY_IS_FRAGMENT_MODE, false) : false) != false) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r3 = this;
                mo1.w r0 = r3.f32820d
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                r1 = 0
                if (r0 != 0) goto L_0x001b
                mo1.w r0 = r3.f32820d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0018
                java.lang.String r2 = "KEY_GET_FRAGMENT"
                boolean r0 = r0.getBooleanExtra(r2, r1)
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                if (r0 == 0) goto L_0x001c
            L_0x001b:
                r1 = 1
            L_0x001c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mo1.C11059w.C11060a.invoke():java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11059w(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public final void finish() {
        C13598b0 b0Var;
        Fragment fragment = getFragment();
        if (fragment != null) {
            if (fragment instanceof FinderProfileUIFragment) {
                FinderProfileUIFragment finderProfileUIFragment = (FinderProfileUIFragment) fragment;
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null && !getActivity().isFinishing()) {
            getActivity().finish();
        }
    }

    public final boolean getFragmentMode() {
        return ((Boolean) this.f32819d.getValue()).booleanValue();
    }

    public final void jumpProfile(String str, long j) {
        String str2 = str;
        C87412m.m108594g(str, "username");
        Intent intent = new Intent();
        intent.putExtra("finder_username", str);
        C11025q qVar = (C11025q) C39818r.f106831a.mo62443b(getContext()).mo62449e(C11025q.class);
        boolean z = false;
        if (qVar != null && !qVar.f32764r) {
            z = true;
        }
        if (z) {
            intent.putExtra("finder_read_feed_id", j);
        } else {
            long j2 = j;
        }
        if (!(getContext() instanceof FinderShareFeedRelUI) && !(getContext() instanceof FinderShareFeedDetailUI) && !(getContext() instanceof FinderMsgFeedDetailUI)) {
            intent.putExtra("KEY_FROM_TIMELINE", true);
        }
        intent.putExtra("key_entrance_type", -1);
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, getContext(), intent, j, (String) null, 0, 1, false, 0, 192, (Object) null);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(getContext(), intent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11059w(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
