package bn2;

import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.plugin.setting.p102ui.fixtools.FixToolsUplogUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: bn2.i */
public class C67297i implements C19877i.C19878a {

    /* renamed from: a */
    public final /* synthetic */ long f193136a;

    /* renamed from: b */
    public final /* synthetic */ FixToolsUplogUI f193137b;

    public C67297i(FixToolsUplogUI fixToolsUplogUI, long j) {
        this.f193137b = fixToolsUplogUI;
        this.f193136a = j;
    }

    public void onResult(boolean z, int i, int i2, int i3) {
        if (z) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.format("%02d", new Object[]{Integer.valueOf(i)}));
            stringBuffer.append(".");
            stringBuffer.append(String.format("%02d", new Object[]{Integer.valueOf(i2)}));
            stringBuffer.append(".");
            stringBuffer.append(String.format("%02d", new Object[]{Integer.valueOf(i3)}));
            this.f193137b.f205609i.setText(stringBuffer);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(String.format("%02d", new Object[]{Integer.valueOf(i)}));
            stringBuffer2.append(String.format("%02d", new Object[]{Integer.valueOf(i2)}));
            stringBuffer2.append(String.format("%02d", new Object[]{Integer.valueOf(i3)}));
            FixToolsUplogUI.f205602s = stringBuffer2.toString();
            Log.m105925i("MicroMsg.FixToolsUplogUI", "uplog choose time maxTime[%d], date[%s]", Long.valueOf(this.f193136a), FixToolsUplogUI.f205602s);
        }
    }
}
