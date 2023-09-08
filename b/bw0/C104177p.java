package bw0;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.plugin.ball.view.FloatMenuView;

/* renamed from: bw0.p */
public class C104177p extends LinearLayoutManager {

    /* renamed from: v */
    public final /* synthetic */ FloatMenuView f308418v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104177p(FloatMenuView floatMenuView, Context context) {
        super(context);
        this.f308418v = floatMenuView;
    }

    public boolean canScrollHorizontally() {
        return false;
    }

    public boolean canScrollVertically() {
        return this.f308418v.f312032C;
    }
}
