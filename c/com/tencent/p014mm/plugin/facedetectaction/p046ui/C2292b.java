package com.tencent.p014mm.plugin.facedetectaction.p046ui;

import android.text.TextPaint;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import de3.C75359b0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.facedetectaction.ui.b */
public class C2292b extends C75359b0 {

    /* renamed from: d */
    public boolean f12437d = true;

    /* renamed from: e */
    public boolean f12438e;

    /* renamed from: f */
    public String f12439f;

    /* renamed from: g */
    public C2293a f12440g;

    /* renamed from: com.tencent.mm.plugin.facedetectaction.ui.b$a */
    public interface C2293a {
        /* renamed from: a */
        void mo2185a(String str);
    }

    public C2292b(String str, int i, int i2, boolean z, C2293a aVar) {
        super(i, i2);
        this.f12438e = z;
        this.f12439f = str;
        this.f12440g = aVar;
    }

    public void onClick(View view) {
        C2293a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetectaction/ui/FaceTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f12437d && (aVar = this.f12440g) != null) {
            aVar.mo2185a(this.f12439f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void setColor(int i, int i2) {
        super.setColor(i, i2);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f12438e) {
            C85875k4.m106189j0(textPaint, 0.8f);
        }
    }
}
