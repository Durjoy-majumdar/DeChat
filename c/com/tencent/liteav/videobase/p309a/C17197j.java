package com.tencent.liteav.videobase.p309a;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.tencent.liteav.videobase.a.j */
public abstract class C17197j extends C17189b {

    /* renamed from: a */
    private final Map<String, Integer> f46462a = new HashMap();

    /* renamed from: b */
    private final Map<String, Integer> f46463b = new HashMap();

    public C17197j(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    public final void mo20134a(String str, int i) {
        this.f46462a.put(str, Integer.valueOf(i));
    }

    public void afterDrawArrays() {
        super.afterDrawArrays();
        Iterator<Map.Entry<String, Integer>> it = this.f46462a.entrySet().iterator();
        int i = 33985;
        while (it.hasNext()) {
            it.next();
            GLES20.glActiveTexture(i);
            OpenGlUtils.bindTexture(getTarget(), 0);
            i++;
        }
        this.f46462a.clear();
    }

    public void beforeDrawArrays(int i) {
        super.beforeDrawArrays(i);
        int i2 = 33985;
        for (Map.Entry next : this.f46462a.entrySet()) {
            Integer num = this.f46463b.get(next.getKey());
            if (num == null) {
                num = Integer.valueOf(GLES20.glGetUniformLocation(getProgramId(), (String) next.getKey()));
                this.f46463b.put(next.getKey(), num);
            }
            GLES20.glActiveTexture(i2);
            OpenGlUtils.bindTexture(getTarget(), ((Integer) next.getValue()).intValue());
            GLES20.glUniform1i(num.intValue(), i2 - 33984);
            i2++;
        }
    }
}
