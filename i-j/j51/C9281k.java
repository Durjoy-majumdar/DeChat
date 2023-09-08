package j51;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader_app.p039ui.ExpandView;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskHeaderView;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskManagerHeaderView;

/* renamed from: j51.k */
public class C9281k extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Drawable f29034d;

    /* renamed from: e */
    public int f29035e;

    /* renamed from: f */
    public final Drawable f29036f;

    public C9281k(Resources resources) {
        this.f29034d = new ColorDrawable(resources.getColor(C0966R.color.f3311nd));
        this.f29035e = resources.getDimensionPixelSize(C0966R.dimen.ac_);
        this.f29036f = new ColorDrawable(resources.getColor(C0966R.color.al6));
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        rect.set(0, 0, 0, this.f29035e);
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            View childAt2 = ((ViewGroup) childAt).getChildAt(0);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            int i2 = this.f29035e + bottom;
            if (childAt.getVisibility() == 8 || childAt2.getVisibility() == 8) {
                if (childAt2 instanceof TaskItemView) {
                    this.f29036f.setBounds(paddingLeft, bottom, width, i2);
                    this.f29036f.draw(canvas);
                }
            } else if ((childAt2 instanceof TaskManagerHeaderView) || (childAt2 instanceof TaskHeaderView) || (childAt2 instanceof ExpandView)) {
                this.f29034d.setBounds(paddingLeft, bottom, width, i2);
                this.f29034d.draw(canvas);
            } else if (childAt2 instanceof TaskItemView) {
                View childAt3 = recyclerView.getChildAt(i + 1);
                if (childAt3 != null) {
                    View childAt4 = ((ViewGroup) childAt3).getChildAt(0);
                    if (!(childAt4 instanceof TaskHeaderView)) {
                        if ((childAt4 instanceof ExpandView) && childAt4.getVisibility() == 8) {
                            this.f29034d.setBounds(paddingLeft, bottom, width, i2);
                            this.f29034d.draw(canvas);
                        }
                    }
                }
                TaskItemView taskItemView = (TaskItemView) childAt2;
                this.f29034d.setBounds(taskItemView.getNamePaddingLeft() + paddingLeft, bottom, width, i2);
                this.f29034d.draw(canvas);
                this.f29036f.setBounds(paddingLeft, bottom, taskItemView.getNamePaddingLeft() + paddingLeft, i2);
                this.f29036f.draw(canvas);
            }
        }
    }
}
