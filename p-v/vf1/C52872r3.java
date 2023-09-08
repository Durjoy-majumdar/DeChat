package vf1;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveSelectRoomForLuckMoneyUI;
import gy3.C87412m;

/* renamed from: vf1.r3 */
public final class C52872r3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveSelectRoomForLuckMoneyUI f147671d;

    public C52872r3(FinderLiveSelectRoomForLuckMoneyUI finderLiveSelectRoomForLuckMoneyUI) {
        this.f147671d = finderLiveSelectRoomForLuckMoneyUI;
    }

    public final void run() {
        Button button;
        FinderLiveSelectRoomForLuckMoneyUI finderLiveSelectRoomForLuckMoneyUI = this.f147671d;
        int i = FinderLiveSelectRoomForLuckMoneyUI.f111548F;
        MMActivityController.C116044q A = finderLiveSelectRoomForLuckMoneyUI.mController.mo177035A(1);
        if (A != null) {
            View view = A.f348149j;
            if (view == null && (view = A.f348148i) == null) {
                view = null;
            }
            if (view != null && (button = (Button) view.findViewById(C0966R.C0970id.f5420en)) != null) {
                AppCompatActivity context = this.f147671d.getContext();
                C87412m.m108593f(context, "context");
                Object systemService = context.getSystemService("window");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
                button.setTextSize(1, (16.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
            }
        }
    }
}
