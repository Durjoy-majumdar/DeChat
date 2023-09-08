package mu0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.tencent.p014mm.booter.CoreService;
import com.tencent.p014mm.plugin.audio.broadcast.base.BaseAudioReceiver;
import com.tencent.p014mm.plugin.audio.broadcast.bluetooth.BluetoothReceiver;
import com.tencent.p014mm.plugin.audio.broadcast.headset.HeadsetPlugReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: mu0.a */
public final class C109638a implements CoreService.C114706e {

    /* renamed from: a */
    public final HashMap<String, BroadcastReceiver> f328232a = new HashMap<>();

    /* renamed from: a */
    public final void mo160857a(BroadcastReceiver broadcastReceiver, String[] strArr, String[] strArr2) {
        Log.m105924i("MicroMsg.AudioBroadcastHelper", "registerBroadcast: " + broadcastReceiver.getClass().getSimpleName());
        IntentFilter intentFilter = new IntentFilter();
        if (!Util.isNullOrNil((String[]) Arrays.copyOf(strArr, strArr.length))) {
            for (String addAction : strArr) {
                intentFilter.addAction(addAction);
            }
        }
        if (!Util.isNullOrNil((String[]) Arrays.copyOf(strArr2, strArr2.length))) {
            for (String addCategory : strArr2) {
                intentFilter.addCategory(addCategory);
            }
        }
        MMApplicationContext.getContext().registerReceiver(broadcastReceiver, intentFilter);
    }

    /* renamed from: b */
    public final void mo160858b(BroadcastReceiver broadcastReceiver) {
        Log.m105924i("MicroMsg.AudioBroadcastHelper", "unRegisterBroadcast: " + broadcastReceiver.getClass().getSimpleName());
        MMApplicationContext.getContext().unregisterReceiver(broadcastReceiver);
    }

    public void registerBroadcasts() {
        Log.m105924i("MicroMsg.AudioBroadcastHelper", "registerBroadcasts()");
        BluetoothReceiver bluetoothReceiver = new BluetoothReceiver();
        Class<BluetoothReceiver> cls = BluetoothReceiver.class;
        this.f328232a.put("BluetoothReceiver", bluetoothReceiver);
        mo160857a(bluetoothReceiver, new String[]{"android.media.ACTION_SCO_AUDIO_STATE_UPDATED", "android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.device.action.ACL_DISCONNECTED", "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"}, new String[0]);
        HeadsetPlugReceiver headsetPlugReceiver = new HeadsetPlugReceiver();
        Class<HeadsetPlugReceiver> cls2 = HeadsetPlugReceiver.class;
        this.f328232a.put("HeadsetPlugReceiver", headsetPlugReceiver);
        mo160857a(headsetPlugReceiver, new String[]{"android.intent.action.HEADSET_PLUG"}, new String[0]);
        BaseAudioReceiver baseAudioReceiver = new BaseAudioReceiver();
        Class<BaseAudioReceiver> cls3 = BaseAudioReceiver.class;
        this.f328232a.put("BaseAudioReceiver", baseAudioReceiver);
        mo160857a(baseAudioReceiver, new String[]{"android.media.AUDIO_BECOMING_NOISY"}, new String[0]);
    }

    public void unRegisterBroadcasts() {
        Log.m105924i("MicroMsg.AudioBroadcastHelper", "unRegisterBroadcasts()");
        try {
            Class<BluetoothReceiver> cls = BluetoothReceiver.class;
            BroadcastReceiver broadcastReceiver = this.f328232a.get("BluetoothReceiver");
            C87412m.m108592e(broadcastReceiver, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.broadcast.bluetooth.BluetoothReceiver");
            mo160858b((BluetoothReceiver) broadcastReceiver);
            Class<HeadsetPlugReceiver> cls2 = HeadsetPlugReceiver.class;
            BroadcastReceiver broadcastReceiver2 = this.f328232a.get("HeadsetPlugReceiver");
            C87412m.m108592e(broadcastReceiver2, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.broadcast.headset.HeadsetPlugReceiver");
            mo160858b((HeadsetPlugReceiver) broadcastReceiver2);
            Class<BaseAudioReceiver> cls3 = BaseAudioReceiver.class;
            BroadcastReceiver broadcastReceiver3 = this.f328232a.get("BaseAudioReceiver");
            C87412m.m108592e(broadcastReceiver3, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.broadcast.base.BaseAudioReceiver");
            mo160858b((BaseAudioReceiver) broadcastReceiver3);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AudioBroadcastHelper", "unRegisterBroadcasts() Exception = %s ", e.getMessage());
        }
    }
}
