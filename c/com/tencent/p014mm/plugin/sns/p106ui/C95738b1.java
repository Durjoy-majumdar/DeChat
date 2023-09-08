package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.ui.b1 */
public interface C95738b1 {

    /* renamed from: com.tencent.mm.plugin.sns.ui.b1$a */
    public static abstract class C95739a {

        /* renamed from: a */
        public View.OnClickListener f279251a = new C95740a();

        /* renamed from: com.tencent.mm.plugin.sns.ui.b1$a$a */
        public class C95740a implements View.OnClickListener {
            public C95740a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/IPreviewImageView$PreviewImageClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.IPreviewImageView$PreviewImageClick$1");
                if (view.getTag() == null) {
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.IPreviewImageView$PreviewImageClick$1");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/IPreviewImageView$PreviewImageClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C95739a.this.mo133182a(((Integer) view.getTag()).intValue());
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.IPreviewImageView$PreviewImageClick$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/IPreviewImageView$PreviewImageClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: a */
        public abstract void mo133182a(int i);
    }

    /* renamed from: a */
    void mo132429a(List<String> list, int i);

    void clean();

    View getView();

    void setImageClick(C95739a aVar);

    void setIsShowAddImage(boolean z);
}
