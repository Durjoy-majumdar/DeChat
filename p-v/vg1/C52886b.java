package vg1;

import android.view.ContextMenu;
import android.view.View;
import bl1.C39775b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.comment.BoxCommentConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import nj3.C76874e0;
import nj3.C76891l0;

/* renamed from: vg1.b */
public final class C52886b implements C76891l0 {

    /* renamed from: a */
    public final /* synthetic */ C39775b f147689a;

    /* renamed from: b */
    public final /* synthetic */ View f147690b;

    /* renamed from: c */
    public final /* synthetic */ C52890e f147691c;

    public C52886b(C39775b bVar, View view, C52890e eVar) {
        this.f147689a = bVar;
        this.f147690b = view;
        this.f147691c = eVar;
    }

    /* renamed from: a */
    public final void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (this.f147689a.f106734e.f144913r <= 0 || e0Var.findItem(165) != null) {
            String str = this.f147691c.f147702c;
            Log.m105920e(str, "msg " + this.f147689a.f106734e.f144903e + " seq:" + this.f147689a.f106734e.f144913r);
        } else if (this.f147689a.f106736g) {
            e0Var.mo107148i(166, this.f147690b.getContext().getString(C0966R.string.m3d), this.f147690b.getContext().getResources().getColor(C0966R.color.f3415ar), C0966R.raw.icons_filled_call_good, this.f147690b.getContext().getResources().getColor(C0966R.color.f3415ar));
        } else {
            e0Var.mo107148i(165, this.f147690b.getContext().getString(C0966R.string.f360454cy3), this.f147690b.getContext().getResources().getColor(C0966R.color.a8o), C0966R.raw.icons_filled_call_good, this.f147690b.getContext().getResources().getColor(C0966R.color.a8o));
        }
        if (C52890e.m59208a(this.f147691c, this.f147689a) && e0Var.findItem(154) == null) {
            e0Var.mo107148i(154, this.f147690b.getContext().getString(C0966R.string.dgj), this.f147690b.getContext().getResources().getColor(C0966R.color.a8o), C0966R.raw.icons_filled_reply, this.f147690b.getContext().getResources().getColor(C0966R.color.a8o));
        }
        if (e0Var.findItem(155) == null) {
            e0Var.mo107148i(155, this.f147690b.getContext().getString(C0966R.string.dx6), this.f147690b.getContext().getResources().getColor(C0966R.color.a8o), C0966R.raw.icons_filled_copy, this.f147690b.getContext().getResources().getColor(C0966R.color.a8o));
        }
        if (C52890e.m59208a(this.f147691c, this.f147689a)) {
            List<Integer> list = BoxCommentConfig.f111608a;
            if (BoxCommentConfig.f111609b.contains(Integer.valueOf(this.f147689a.f106734e.f144903e)) && e0Var.findItem(156) == null) {
                e0Var.mo107148i(156, this.f147690b.getContext().getString(C0966R.string.dxw), this.f147690b.getContext().getResources().getColor(C0966R.color.a8o), C0966R.raw.icons_filled_report_problem, this.f147690b.getContext().getResources().getColor(C0966R.color.a8o));
            }
        }
    }
}
