package p723vf;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;

/* renamed from: vf.p */
public final class C52866p {

    /* renamed from: a */
    public static final C52866p f147663a = new C52866p();

    /* renamed from: a */
    public final String mo73632a(View view, int i) {
        int i2 = 0;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < i; i3++) {
                sb.append("-");
            }
            sb.append(viewGroup.getVisibility() + XVFSFile.PATH_SEPARATOR_CHAR + viewGroup.getWindowVisibility() + XVFSFile.PATH_SEPARATOR_CHAR + viewGroup + ":[" + viewGroup.getX() + ',' + viewGroup.getY() + ',' + viewGroup.getWidth() + ',' + viewGroup.getHeight() + "]:" + viewGroup.getContext() + 10);
            while (i2 < childCount) {
                View childAt = viewGroup.getChildAt(i2);
                C87412m.m108593f(childAt, "child");
                sb.append(mo73632a(childAt, i + 1));
                i2++;
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "builder.toString()");
            return sb4;
        }
        StringBuilder sb5 = new StringBuilder();
        while (i2 < i) {
            sb5.append("-");
            i2++;
        }
        String sb6 = sb5.toString();
        C87412m.m108593f(sb6, "StringBuilder().apply(builderAction).toString()");
        return sb6 + view.getVisibility() + XVFSFile.PATH_SEPARATOR_CHAR + view.getWindowVisibility() + XVFSFile.PATH_SEPARATOR_CHAR + view + ":[" + view.getX() + ',' + view.getY() + ',' + view.getWidth() + ',' + view.getHeight() + "]:" + view.getContext() + 10;
    }
}
