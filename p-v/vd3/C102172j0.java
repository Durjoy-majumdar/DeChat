package vd3;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;

/* renamed from: vd3.j0 */
public class C102172j0 {

    /* renamed from: j */
    public static LruCache<String, Integer> f300848j = new LruCache<>(50);

    /* renamed from: a */
    public Context f300849a;

    /* renamed from: b */
    public StringBuilder f300850b;

    /* renamed from: c */
    public SpannableStringBuilder f300851c = new SpannableStringBuilder();

    /* renamed from: d */
    public SpannableString f300852d;

    /* renamed from: e */
    public SpannableStringBuilder f300853e = new SpannableStringBuilder();

    /* renamed from: f */
    public CharacterStyle f300854f = new ForegroundColorSpan(-5066062);

    /* renamed from: g */
    public int f300855g;

    /* renamed from: h */
    public int f300856h;

    /* renamed from: i */
    public int f300857i = 3;

    public C102172j0(Context context) {
        this.f300849a = context;
    }

    /* renamed from: a */
    public final void mo141711a() {
        try {
            for (String split : ((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINOF_VOICE_INPUT_DEF_LANG_HISTORY_STRING, "")).split(";")) {
                String[] split2 = split.split(XVFSFile.PATH_SEPARATOR);
                if (split2.length == 2) {
                    f300848j.put(split2[0], Integer.valueOf(Util.getInt(split2[1], 0)));
                }
            }
        } catch (Error unused) {
        }
    }

    /* renamed from: b */
    public synchronized void mo141712b(String str, int i) {
        f300848j.put(str, Integer.valueOf(i));
        StringBuilder sb = new StringBuilder();
        Object[] array = f300848j.keySet().toArray();
        Object[] array2 = f300848j.values().toArray();
        for (int i2 = 0; i2 < array.length; i2++) {
            sb.append(array[i2]);
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(array2[i2]);
            sb.append(";");
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINOF_VOICE_INPUT_DEF_LANG_HISTORY_STRING, sb.toString());
    }

    /* renamed from: c */
    public void mo141713c(MMEditText mMEditText) {
        if (mMEditText != null) {
            this.f300855g = mMEditText.getSelectionStart();
            this.f300856h = mMEditText.getSelectionEnd();
            this.f300850b = new StringBuilder(mMEditText.getText());
            Log.m105919d("MicroMsg.VoiceInputHelper", "saveHistory historySelectStart = %s, historySelectEnd = %s, historyStringBuilder = %s", Integer.valueOf(this.f300855g), Integer.valueOf(this.f300856h), this.f300850b);
            if (mMEditText.getText().toString().equalsIgnoreCase("")) {
                this.f300851c.clear();
            }
            if (this.f300855g < 0) {
                this.f300855g = 0;
            }
            if (this.f300856h < 0) {
                this.f300856h = 0;
            }
        }
    }

    /* renamed from: d */
    public void mo141714d(MMEditText mMEditText) {
        if (mMEditText != null) {
            this.f300857i = 0;
            SpannableString M = C96963p0.wx0().mo83004M(this.f300849a, mMEditText.getText().toString());
            this.f300852d = M;
            Log.m105919d("MicroMsg.VoiceInputHelper", "setFinalText emojiSpannableString = %s", M);
            mMEditText.setText(this.f300852d);
            mMEditText.setSelection(this.f300852d.length());
        }
    }

    /* renamed from: e */
    public void mo141715e(MMEditText mMEditText, String str, boolean z) {
        int i;
        int i2;
        if (mMEditText != null) {
            if (this.f300850b != null) {
                int length = this.f300855g + str.length();
                this.f300851c.clear();
                this.f300853e.clear();
                if (z) {
                    SpannableString M = C96963p0.wx0().mo83004M(this.f300849a, this.f300850b.subSequence(0, this.f300855g));
                    this.f300852d = M;
                    SpannableStringBuilder append = this.f300851c.append(M);
                    SpannableStringBuilder spannableStringBuilder = this.f300853e;
                    if (!(spannableStringBuilder == null || str.length() == 0)) {
                        if (str.length() < this.f300857i) {
                            i2 = str.length();
                            i = 0;
                        } else {
                            i2 = str.length();
                            i = i2 - this.f300857i;
                        }
                        spannableStringBuilder.append(str).setSpan(this.f300854f, i, i2, 33);
                    }
                    SpannableStringBuilder append2 = append.append(spannableStringBuilder);
                    StringBuilder sb = this.f300850b;
                    append2.append(sb.subSequence(this.f300856h, sb.length()));
                } else {
                    SpannableString M2 = C96963p0.wx0().mo83004M(this.f300849a, str);
                    this.f300852d = M2;
                    this.f300851c.append(M2);
                }
                Log.m105919d("MicroMsg.VoiceInputHelper", "setText historySelectStart = %s, historySelectEnd = %s, cursor = %s, length = %s, text = %s, spannableStringBuilder = %s", Integer.valueOf(this.f300855g), Integer.valueOf(this.f300856h), Integer.valueOf(length), Integer.valueOf(this.f300851c.length()), str, this.f300851c);
                mMEditText.setText(this.f300851c);
                if (length > this.f300851c.length()) {
                    return;
                }
                if (length == 0) {
                    mMEditText.setSelection(this.f300851c.length());
                } else {
                    mMEditText.setSelection(length);
                }
            } else {
                throw new IllegalStateException("You should saveHistory before setText");
            }
        }
    }
}
