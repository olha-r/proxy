package proxy.repositories;

import java.util.HashMap;
import java.util.Map;

import proxy.entities.Sticker;

public class Cache {

    private static final Map<Long, Sticker> STICKERS = new HashMap<>();

    public static Sticker findPersonById(Long id) {
	return STICKERS.get(id);
    }

    public static void cache(Sticker sticker) {
	STICKERS.put(sticker.getId(), sticker);
    }

}
