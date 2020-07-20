package com.example.volume;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/math")

public class Rectangle {
       @PostMapping ("/volume/{length}/{width}/{height}")
        public String getRectangularVolume(
                @PathVariable int length,
                @PathVariable int width,
                @PathVariable int height
        ) {
           return String.format("The volume of a %dX%dX%d rectangle is %d", length, width, height, length * width * height);
        }

    @PatchMapping ("/volume/{length}/{width}/{height}")
    public String getRectangularVolumeWithPatch (
            @PathVariable int length,
            @PathVariable int width,
            @PathVariable int height
    ) {
        return String.format("The volume of a %dX%dX%d rectangle is %d", length, width, height, length * width * height);
    }

}

