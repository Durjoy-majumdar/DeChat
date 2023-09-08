package j51;

import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.downloader_app.p039ui.BottomEntranceView;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskListView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: j51.a */
public class C46398a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ BottomEntranceView f125001d;

    public C46398a(BottomEntranceView bottomEntranceView) {
        this.f125001d = bottomEntranceView;
    }

    public void onGlobalLayout() {
        BottomEntranceView bottomEntranceView = this.f125001d;
        int i = BottomEntranceView.f110412i;
        if (bottomEntranceView.getVisibility() != 8) {
            for (ViewParent parent = bottomEntranceView.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof TaskListView) {
                    int computeVerticalScrollRange = ((TaskListView) parent).computeVerticalScrollRange();
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bottomEntranceView.getLayoutParams();
                    int i2 = bottomEntranceView.f110417h;
                    if (computeVerticalScrollRange < i2) {
                        layoutParams.topMargin += i2 - computeVerticalScrollRange;
                        bottomEntranceView.setLayoutParams(layoutParams);
                    } else if (computeVerticalScrollRange > i2) {
                        int i3 = layoutParams.topMargin;
                        int i4 = bottomEntranceView.f110416g;
                        if (i3 > i4) {
                            layoutParams.topMargin = i3 - (computeVerticalScrollRange - i2);
                            bottomEntranceView.setLayoutParams(layoutParams);
                        } else if (i3 < i4) {
                            layoutParams.topMargin = i4;
                            bottomEntranceView.setLayoutParams(layoutParams);
                        }
                    }
                    Log.m105919d("MicroMsg.BottomEntranceView", "listH = %d, mContentH = %d, topMargin = %d, bottomMargin = %d", Integer.valueOf(computeVerticalScrollRange), Integer.valueOf(bottomEntranceView.f110417h), Integer.valueOf(layoutParams.topMargin), Integer.valueOf(layoutParams.bottomMargin));
                    return;
                }
            }
        }
    }
}
