package a61;

import android.os.Handler;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.autogen.events.EmojiFileCleanTaskEvent;
import f40.C86709a0;
import f40.C86718e;

/* renamed from: a61.a */
public class C27747a implements C114661d0 {
    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                EmojiFileCleanTaskEvent emojiFileCleanTaskEvent = new EmojiFileCleanTaskEvent();
                emojiFileCleanTaskEvent.f78774d.f78775a = 0;
                emojiFileCleanTaskEvent.publish();
            }
        }
    }

    public void onAppForeground(String str) {
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                EmojiFileCleanTaskEvent emojiFileCleanTaskEvent = new EmojiFileCleanTaskEvent();
                emojiFileCleanTaskEvent.f78774d.f78775a = 1;
                emojiFileCleanTaskEvent.publish();
            }
        }
    }
}
