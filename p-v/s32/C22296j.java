package s32;

import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.ShuffleView;
import java.util.ArrayList;

/* renamed from: s32.j */
public class C22296j implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ ShuffleView f63205d;

    public C22296j(ShuffleView shuffleView) {
        this.f63205d = shuffleView;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ShuffleView shuffleView = this.f63205d;
        DisplayMetrics displayMetrics = ShuffleView.f53077E;
        shuffleView.mo23925l();
        ShuffleView shuffleView2 = this.f63205d;
        for (int i9 = 0; i9 < shuffleView2.f53097v; i9++) {
            shuffleView2.mo23924k((View) ((ArrayList) shuffleView2.f53082d).get(i9), i9);
        }
        this.f63205d.removeOnLayoutChangeListener(this);
    }
}
