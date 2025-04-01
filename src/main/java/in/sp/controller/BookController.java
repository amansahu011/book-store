package in.sp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book-store")
public class BookController {

    @GetMapping("/{bookId}")
    public ResponseEntity<String> getBook(@PathVariable String bookId) {
        return new ResponseEntity<>("Book found: " + bookId, HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<String>> getAllBooks() {
        List<String> books = new ArrayList<>();
        books.add("Java");
        books.add("MongoDB");
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<String> createBook(@RequestBody String book) {
        return new ResponseEntity<>("Created: " + book, HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<String> updateBook(@RequestBody String book) {
        return new ResponseEntity<>("Updated: " + book, HttpStatus.OK);
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable String bookId) {
        return new ResponseEntity<>("Book deleted successfully: " + bookId, HttpStatus.OK);
    }
}

