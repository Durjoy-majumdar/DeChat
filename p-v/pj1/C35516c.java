package pj1;

import android.os.Looper;
import com.tencent.p014mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: pj1.c */
public final class C35516c {

    /* renamed from: a */
    public final HashSet<MultiStreamPreviewView> f94974a = new HashSet<>();

    /* renamed from: b */
    public final ConcurrentLinkedQueue<WeakReference<MultiStreamPreviewView>> f94975b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    public final MMHandler f94976c = new MMHandler(Looper.getMainLooper());
}
