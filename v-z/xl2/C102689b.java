package xl2;

import android.util.Pair;
import com.tencent.p014mm.plugin.scanner.word.ImageWordScanDetailEngine;

/* renamed from: xl2.b */
public class C102689b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f303302d;

    /* renamed from: e */
    public final /* synthetic */ C102690c f303303e;

    /* renamed from: f */
    public final /* synthetic */ ImageWordScanDetailEngine f303304f;

    public C102689b(ImageWordScanDetailEngine imageWordScanDetailEngine, String str, C102690c cVar) {
        this.f303304f = imageWordScanDetailEngine;
        this.f303302d = str;
        this.f303303e = cVar;
    }

    public void run() {
        this.f303304f.f273349e.setValue(new Pair(this.f303302d, this.f303303e));
    }
}
