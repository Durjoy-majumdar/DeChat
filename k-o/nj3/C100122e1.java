package nj3;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C93101b;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiStoreVpHeader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gc0.C20828a;
import i61.C98601f;
import java.util.LinkedList;
import kg3.C76577a;
import te3.C101754a80;
import te3.C52077y70;
import w51.C102344i;

/* renamed from: nj3.e1 */
public abstract class C100122e1 extends C103853a {

    /* renamed from: d */
    public final C100121d1 f293282d;

    public C100122e1() {
        C100121d1 d1Var = new C100121d1();
        this.f293282d = d1Var;
        SparseArray<View>[] sparseArrayArr = new SparseArray[1];
        for (int i = 0; i < 1; i++) {
            sparseArrayArr[i] = new SparseArray<>();
        }
        d1Var.f293280d = 1;
        d1Var.f293281e = sparseArrayArr[0];
        d1Var.f293279c = sparseArrayArr;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        C100121d1 d1Var = this.f293282d;
        if (d1Var.f293280d == 1) {
            d1Var.f293281e.put(i, view);
        } else {
            d1Var.f293279c[0].put(i, view);
        }
        view.setAccessibilityDelegate((View.AccessibilityDelegate) null);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        C102344i.C102348c cVar;
        String str;
        String str2;
        C100121d1 d1Var = this.f293282d;
        View view2 = null;
        if (d1Var.f293280d == 1) {
            view = C100121d1.m130820a(d1Var.f293281e, i);
        } else {
            SparseArray<View>[] sparseArrayArr = d1Var.f293279c;
            view = sparseArrayArr.length > 0 ? C100121d1.m130820a(sparseArrayArr[0], i) : null;
        }
        C102344i iVar = (C102344i) this;
        LinkedList<C93101b> linkedList = iVar.f301440e;
        if (linkedList != null) {
            int size = i % linkedList.size();
            if (view == null) {
                Log.m105924i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "getView inflate");
                view = View.inflate(iVar.f301441f, C0966R.C0971layout.cka, (ViewGroup) null);
                cVar = new C102344i.C102348c(iVar, view);
                view.setTag(cVar);
            } else {
                cVar = (C102344i.C102348c) view.getTag();
                int i2 = EmojiStoreVpHeader.m117650a(iVar.f301441f)[0];
                cVar.f301448a.setLayoutParams(new LinearLayout.LayoutParams(i2, ((i2 * 3) / 8) + 1));
            }
            view.setTag(C0966R.C0970id.cfp, Integer.valueOf(size));
            view.setOnClickListener(iVar);
            C93101b bVar = iVar.f301440e.get(size);
            if (bVar == null) {
                Log.m105920e("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "BaseEmotionBanner is null.");
            } else {
                if (bVar.f268229c) {
                    C101754a80 a802 = bVar.f268227a;
                    str = a802.f297838d.f145740g;
                    str2 = Util.isNullOrNil(a802.f297840f) ? "H5" : "Toptic";
                } else {
                    C52077y70 y702 = bVar.f268228b;
                    str = y702.f145152e.f145740g;
                    str2 = y702.f145151d.f298994d;
                }
                if (!Util.isNullOrNil(str)) {
                    EmojiInfo f = EmojiLogic.m117475f(str2, 8, str, C76577a.m92156g(iVar.f301441f), true);
                    if (f != null) {
                        cVar.f301448a.setImageFilePath(f.mo62640K1());
                    } else if (iVar.f301444i.contains(str)) {
                        Log.m105924i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "url has add to list. no need to try load image.");
                        cVar.f301448a.setImageFilePath("-");
                    } else {
                        C20828a.m22825b().mo32521j(str, (ImageView) null, C98601f.m128140e(str2, str, false, str2, "BANNER"), iVar.f301445j);
                        iVar.f301444i.add(str);
                    }
                }
                Log.m105919d("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "position:%d allPostion:%d banner url:%s ", Integer.valueOf(size), Integer.valueOf(i), str);
                view2 = view;
            }
        }
        viewGroup.addView(view2);
        return view2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void notifyDataSetChanged() {
        C100121d1 d1Var = this.f293282d;
        View[] viewArr = d1Var.f293277a;
        int[] iArr = d1Var.f293278b;
        boolean z = d1Var.f293280d > 1;
        SparseArray<View> sparseArray = d1Var.f293281e;
        for (int length = viewArr.length - 1; length >= 0; length--) {
            View view = viewArr[length];
            if (view != null) {
                int i = iArr[length];
                viewArr[length] = null;
                iArr[length] = -1;
                if (i >= 0) {
                    if (z) {
                        sparseArray = d1Var.f293279c[i];
                    }
                    sparseArray.put(length, view);
                    view.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                }
            }
        }
        int length2 = d1Var.f293277a.length;
        int i2 = d1Var.f293280d;
        SparseArray<View>[] sparseArrayArr = d1Var.f293279c;
        for (int i3 = 0; i3 < i2; i3++) {
            SparseArray<View> sparseArray2 = sparseArrayArr[i3];
            int size = sparseArray2.size();
            int i4 = size - length2;
            int i5 = size - 1;
            int i6 = 0;
            while (i6 < i4) {
                sparseArray2.remove(sparseArray2.keyAt(i5));
                i6++;
                i5--;
            }
        }
        super.notifyDataSetChanged();
    }
}
