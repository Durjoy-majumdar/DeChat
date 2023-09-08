package vr2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.concurrent.ConcurrentHashMap;
import te3.w64;

/* renamed from: vr2.t */
public class C102266t {

    /* renamed from: a */
    public ConcurrentHashMap<String, CharSequence> f301194a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public ConcurrentHashMap<String, String> f301195b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public ConcurrentHashMap<String, CharSequence> f301196c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo141826a(w64 w64, CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        ConcurrentHashMap<String, CharSequence> concurrentHashMap = this.f301194a;
        concurrentHashMap.put(w64.f299709j + "-" + w64.f299714r + "-" + w64.f299707h, charSequence);
        SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.data.SnsCommentData");
    }

    /* renamed from: b */
    public void mo141827b(w64 w64, String str) {
        SnsMethodCalculate.markStartTimeMs("putEmojiMd5", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        ConcurrentHashMap<String, String> concurrentHashMap = this.f301195b;
        concurrentHashMap.put(w64.f299709j + "-" + w64.f299714r + "-" + w64.f299707h, str);
        SnsMethodCalculate.markEndTimeMs("putEmojiMd5", "com.tencent.mm.plugin.sns.data.SnsCommentData");
    }

    /* renamed from: c */
    public void mo141828c(w64 w64, CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("putShortComment", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        ConcurrentHashMap<String, CharSequence> concurrentHashMap = this.f301196c;
        concurrentHashMap.put(w64.f299709j + "-" + w64.f299714r + "-" + w64.f299707h, charSequence);
        SnsMethodCalculate.markEndTimeMs("putShortComment", "com.tencent.mm.plugin.sns.data.SnsCommentData");
    }
}
