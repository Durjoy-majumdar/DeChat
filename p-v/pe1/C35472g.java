package pe1;

import android.app.Activity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: pe1.g */
public abstract class C35472g {

    /* renamed from: d */
    public String f94903d;

    /* renamed from: e */
    public int f94904e = -1;

    /* renamed from: f */
    public WeakReference<Activity> f94905f;

    public C35472g(String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f94903d = str;
    }
}
