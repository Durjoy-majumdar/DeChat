package uv0;

import android.content.Context;
import android.widget.TextView;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: uv0.h */
public final class C111234h implements C111233f {

    /* renamed from: a */
    public Map<Integer, C111233f> f333106a = new HashMap();

    /* renamed from: uv0.h$b */
    public static class C111236b {

        /* renamed from: a */
        public static C111234h f333107a = new C111234h((C111235a) null);
    }

    public C111234h(C111235a aVar) {
    }

    /* renamed from: a */
    public boolean mo64043a(Context context, BallInfo ballInfo) {
        C111233f fVar = (C111233f) ((HashMap) this.f333106a).get(Integer.valueOf(ballInfo.f311686d));
        if (fVar == null) {
            return false;
        }
        return fVar.mo64043a(context, ballInfo);
    }

    /* renamed from: b */
    public boolean mo64044b(TextView textView, BallInfo ballInfo) {
        C111233f fVar = (C111233f) ((HashMap) this.f333106a).get(Integer.valueOf(ballInfo.f311686d));
        if (fVar == null) {
            return false;
        }
        return fVar.mo64044b(textView, ballInfo);
    }
}
