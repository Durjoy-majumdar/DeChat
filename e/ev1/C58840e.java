package ev1;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;

/* renamed from: ev1.e */
public abstract class C58840e extends C58838a {

    /* renamed from: h */
    public String f168438h;

    /* renamed from: i */
    public String f168439i;

    /* renamed from: j */
    public Bitmap f168440j;

    /* renamed from: n */
    public int f168441n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58840e(String str, String str2, String str3, Bitmap bitmap, int i, long j) {
        super(str, j);
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str3, "desc");
        this.f168438h = str2;
        this.f168439i = str3;
        this.f168440j = bitmap;
        this.f168441n = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return 2;
    }

    public long getItemId() {
        return 0;
    }

    /* renamed from: n */
    public void mo84041n(View view) {
        C87412m.m108594g(view, "view");
    }

    /* renamed from: t */
    public abstract void mo84048t(C60905o oVar, int i, int i2, boolean z, List<Object> list);
}
