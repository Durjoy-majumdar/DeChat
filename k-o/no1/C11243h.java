package no1;

import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import java.util.List;
import rx3.C13604l;

/* renamed from: no1.h */
public final class C11243h extends C11240e {

    /* renamed from: f */
    public final List<C13604l<Integer, Integer>> f33145f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11243h(androidx.appcompat.app.AppCompatActivity r9, androidx.fragment.app.Fragment r10, java.util.List r11, java.lang.String r12, int r13, gy3.C8480h r14) {
        /*
            r8 = this;
            r13 = r13 & 8
            if (r13 == 0) goto L_0x0006
            java.lang.String r12 = ""
        L_0x0006:
            r5 = r12
            java.lang.String r12 = "activity"
            gy3.C87412m.m108594g(r9, r12)
            java.lang.String r12 = "weImageDatas"
            gy3.C87412m.m108594g(r11, r12)
            java.lang.String r12 = "name"
            gy3.C87412m.m108594g(r5, r12)
            r3 = 0
            r4 = 0
            r6 = 8
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f33145f = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: no1.C11243h.<init>(androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.Fragment, java.util.List, java.lang.String, int, gy3.h):void");
    }

    /* renamed from: a */
    public void mo11313a() {
        KeyEvent.Callback callback;
        for (C13604l next : this.f33145f) {
            int intValue = next.f38555d.intValue();
            Fragment fragment = this.f33139b;
            WeImageView weImageView = null;
            if (fragment != null) {
                View view = fragment.getView();
                callback = view != null ? view.findViewById(intValue) : null;
            } else {
                callback = this.f33138a.findViewById(intValue);
            }
            if (callback instanceof WeImageView) {
                weImageView = (WeImageView) callback;
            }
            if (weImageView != null) {
                weImageView.setImageResource(next.f38556e.intValue());
            }
        }
    }
}
