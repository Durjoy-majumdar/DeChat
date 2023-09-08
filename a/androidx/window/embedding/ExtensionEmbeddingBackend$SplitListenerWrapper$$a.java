package androidx.window.embedding;

import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.List;

public final /* synthetic */ class ExtensionEmbeddingBackend$SplitListenerWrapper$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExtensionEmbeddingBackend.SplitListenerWrapper f45091d;

    /* renamed from: e */
    public final /* synthetic */ List f45092e;

    public /* synthetic */ ExtensionEmbeddingBackend$SplitListenerWrapper$$a(ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper, List list) {
        this.f45091d = splitListenerWrapper;
        this.f45092e = list;
    }

    public final void run() {
        ExtensionEmbeddingBackend.SplitListenerWrapper.m168130accept$lambda1(this.f45091d, this.f45092e);
    }
}
