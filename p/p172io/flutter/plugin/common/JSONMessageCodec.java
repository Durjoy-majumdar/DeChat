package p172io.flutter.plugin.common;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: io.flutter.plugin.common.JSONMessageCodec */
public final class JSONMessageCodec implements MessageCodec<Object> {
    public static final JSONMessageCodec INSTANCE = new JSONMessageCodec();

    private JSONMessageCodec() {
    }

    public Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(StringCodec.INSTANCE.decodeMessage(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    public ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        Object wrap = JSONUtil.wrap(obj);
        return wrap instanceof String ? StringCodec.INSTANCE.encodeMessage(JSONObject.quote((String) wrap)) : StringCodec.INSTANCE.encodeMessage(wrap.toString());
    }
}
